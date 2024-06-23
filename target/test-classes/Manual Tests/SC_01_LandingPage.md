# Global Weather Application Landing Page

**PREPARED BY**: Hashara Nethmin  
**DESIGNATION**: Undergraduate  
**DATE**: 23.06.2024  

## Scenario Details

**SCENARIO ID**: SC_01  
**SCENARIO DESCRIPTION**: Landing on the page and check weather while inputting data  

## Test Cases

| TEST CASE ID | TEST CASE DESCRIPTION                             | PRECONDITION                       | TEST DATA                                       | EXPECTED RESULT                                       | POSTCONDITION        | ACTUAL RESULT         | STATUS |
|--------------|---------------------------------------------------|------------------------------------|-------------------------------------------------|-------------------------------------------------------|----------------------|-----------------------|--------|
| TC_001       | Enter a valid city, state, and country            | User needs to access Landing Page  | City: Colombo, State: , Country: Sri Lanka      | Should display weather information for Colombo, Sri Lanka | Press Check Button   | Item lists occurred   | Pass   |
| TC_002       | Enter a valid city and country, leave state empty | User needs to access Landing Page  | City: Colombo, State: , Country: Sri Lanka      | Should display weather information for Colombo, Sri Lanka | Press Check Button   | Item lists occurred   | Pass   |
| TC_003       | Enter only city, leave state and country empty    | User needs to access Landing Page  | City: Colombo, State: , Country:                | Should display an error or prompt for more information  | Press Check Button   | Error prompt displayed| Pass   |
| TC_004       | Enter an invalid city name                        | User needs to access Landing Page  | City: InvalidCity, State: , Country: Sri Lanka  | Should display an error indicating city not found       | Press Check Button   | Error message displayed | Pass  |
| TC_005       | Enter an invalid country name                     | User needs to access Landing Page  | City: Colombo, State: , Country: InvalidCountry | Should display an error indicating country not found    | Press Check Button   | Error message displayed | Pass  |
| TC_006       | Enter a city name with special characters         | User needs to access Landing Page  | City: Colombo@123, State: , Country: Sri Lanka  | Should display an error indicating invalid input        | Press Check Button   | Error message displayed | Pass  |
| TC_007       | Leave all input fields empty                      | User needs to access Landing Page  | City: , State: , Country:                       | Should display an error indicating all fields are required | Press Check Button | Error message displayed | Pass  |
| TC_008       | Enter a very long city name                       | User needs to access Landing Page  | City: a very long string, State: , Country: Sri Lanka | Should handle the input gracefully and display appropriate error | Press Check Button | Error message displayed | Pass  |
| TC_009       | Enter a valid city and country, and a valid state | User needs to access Landing Page  | City: New York, State: NY, Country: USA         | Should display weather information for New York, NY, USA | Press Check Button   | Item lists occurred    | Pass   |
| TC_010       | Enter a valid city and state, leave country empty | User needs to access Landing Page  | City: New York, State: NY, Country:             | Should display weather information for New York, NY      | Press Check Button | Item lists occurred    | Pass   |
| TC_011       | Press Continue Button                             | User needs to access Landing Page  | User SignIn                                     | Land to Purchase screen                                 |                      | Land to Purchase screen | Pass   |

## Test Data Examples

| TEST CASE ID | TEST DATA EXAMPLES                                           |
|--------------|--------------------------------------------------------------|
| TC_001       | "Colombo", "", "Sri Lanka"                                   |
| TC_002       | "Colombo", "", "Sri Lanka"                                   |
| TC_003       | "Colombo", "", ""                                            |
| TC_004       | "InvalidCity", "", "Sri Lanka"                               |
| TC_005       | "Colombo", "", "InvalidCountry"                              |
| TC_006       | "Colombo@123", "", "Sri Lanka"                               |
| TC_007       | "", "", ""                                                   |
| TC_008       | "A very long city name that exceeds normal length", "", "Sri Lanka" |
| TC_009       | "New York", "NY", "USA"                                      |
| TC_010       | "New York", "NY", ""                                         |
