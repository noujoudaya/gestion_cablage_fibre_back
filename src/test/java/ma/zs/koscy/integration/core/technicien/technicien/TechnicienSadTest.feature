Feature: Technicien

  Background:
    * call read('karate-config.js')
    * call read('db_cleaner.js')
    * url technicienUrl
    * header Content-Type = 'application/json'

    * def postBody = read('TechnicienSave.json')
    * def FindAllSchema = read('TechnicienSchema.json')
    * def uuid = function() { return '' + java.util.UUID.randomUUID(); }
    * postBody.cin = uuid()

  @duplicate
  Scenario Outline: POST Technicien Twice with same cin - expect <responseCode> as response code
    * postBody.code = uniqueId
    * def count = db.readValue('select count(*) FROM item.technicien')

    * path ''
    * header Authorization = 'Bearer ' + adminToken
    * request postBody
    * method POST
    * status <responseCode>
    * eval if(__num==1 && count != db.readValue('select count(*) FROM item.technicien')) karate.fail("technicien count values in DB are different")

    Examples:
      | responseCode |
      | 201          |
      | 226          |

  Scenario: Fail - GetByID Not Found

    * path 'id', 99999999
    * header Authorization = 'Bearer ' + adminToken
    * method GET
    * status 404
    * match response.length == 0



  Scenario: Fail - POST Technicien without Body

    * path ''
    * header Authorization = 'Bearer ' + adminToken
    * method POST
    * status 400
    * match response.error == "Bad Request"



  Scenario: Fail - POST Technicien without Authorization

    * path ''
    * header Authorization = 'Bearer unvalid'
    * request postBody
    * method POST
    * status 500



  Scenario: Fail - Save Technicien with method PATCH

    * path ''
    * header Authorization = 'Bearer ' + adminToken
    * method PATCH
    * status 405
    * match response.error == "Method Not Allowed"
