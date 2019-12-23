#Author: rico.amr@gmail.com

Feature: Create a employee
	
Background:
	Given url urlBase
	* def uuid = java.util.UUID.randomUUID().toString()
	
@create @ready
Scenario: Create & GET employee
# cria empregado
	Given path 'create'
	And request {"name":"#(uuid)", "salary":"123","age":"23"}
	When method POST
	Then status 200
	And match response contains {name: #(uuid), salary: '123', age: '23', id: #notnull}
	* def createResult = response

# valida se o empregado foi criado corretamente
	Given path 'employee/' + createResult.id
	When method GET
	Then status 200
	And match response contains {id:'#(createResult.id)',employee_name:'#(uuid)',employee_salary:'123',employee_age:'23',profile_image: #present}
	
