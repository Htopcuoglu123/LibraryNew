Feature: User accounts
  As a user I should be able to login with different users using correct librarian username and password
  when I login I should be able to see username in the account username section
  @B26G32-108
  Scenario Outline: Verify user information<email>
    Given I am on the login page
    When I login using "<email>" and "<logInpassword>"
    Then account holder name should be "<name>"
    @librarians
    Examples:
      | email               | logInpassword| name              |
      | librarian1@library  | qU9mrvur | Test Librarian 1  |
      | librarian2@library  | uYrhHmmj | Test Librarian 2  |
      | librarian3@library  | DFvU4b1i | Test Librarian 3  |
#      | librarian4@library  | 3lwxJ1Kk | Test Librarian  4  |
#      | librarian5@library  | hj65YBiE | Test Librarian  5  |
#      | librarian6@library  | QaG7mkXA | Test Librarian  6  |
#      | librarian7@library  | C5WUiPUP | Test Librarian  7  |
#      | librarian8@library  | UECJkTnl | Test Librarian  8  |
#      | librarian9@library  | MSx8u9n4 | Test Librarian  9  |
#      | librarian10@library | ZIkOcbCa | Test Librarian  10 |
#      | librarian11@library | fsRRgXxB | Test Librarian  11 |
#      | librarian12@library | wHhJQDSK | Test Librarian  12 |
#      | librarian13@library | YCJCbmU3 | Test Librarian 13  |
#      | librarian14@library | bWN7YaaB | Test Librarian 14  |
#      | librarian15@library | YLu0ZIMj | Test Librarian 15  |
#      | librarian16@library | MnG7Xy72 | Test Librarian 16  |
#      | librarian17@library | adE5UAha | Test Librarian 17  |
#      | librarian18@library | FZLa1m9D | Test Librarian 18  |
#      | librarian19@library | f7q2SyVX | Test Librarian 19  |
#      | librarian20@library | MVI4SRzg | Test Librarian 20  |
#      | librarian21@library | ZxlVsgKX | Test Librarian 21  |
#      | librarian22@library | JUXl6dnx | Test Librarian 22  |
#      | librarian23@library | 6PQrr2Ok | Test Librarian 23  |
#      | librarian24@library | 8v8ZByKA | Test Librarian 24  |
#      | librarian25@library | Uplz5iPS | Test Librarian 25  |
#      | librarian26@library | g2X4lxZz | Test Librarian 26  |
#      | librarian27@library | la4sfpjs | Test Librarian 27  |
#      | librarian28@library | x3AVlP4e | Test Librarian 28  |
#      | librarian29@library | m0cvGNnH | Test Librarian 29  |
#      | librarian30@library | oZzv4ePp | Test Librarian 30  |
#      | librarian31@library | rVPrG4uI | Test Librarian 31  |
#      | librarian32@library | 72kOI6Zl | Test Librarian 32  |
#      | libraria33@library  | RLYB9ZPA | Test Librarian 33  |
#      | librarian34@library | n3jnk5Rd | Test Librarian 34  |
#      | librarian35@library | H11DHnKj | Test Librarian 35  |
#      | librarian36@library | tXH2IlVj | Test Librarian 36  |
#      | librarian37@library | bkO2Kl4d | Test Librarian 37  |
#      | librarian38@library | 6TN8WpcY | Test Librarian 38  |
#      | librarian39@library | snPPHvLX | Test Librarian 39  |
#      | librarian40@library | 5NRVIgK3 | Test Librarian 40  |
#      | librarian41@library | gDSgcjYr | Test Librarian 41  |
#      | librarian42@library | EDpvlxKt | Test Librarian 42  |
#      | librarian43@library | 9Wa02cAu | Test Librarian 43  |
#      | librarian44@library | Jn82fRUp | Test Librarian 44  |
#      | librarian45@library | ShIqQpOy | Test Librarian 45  |
#      | librarian46@library | BEHjX7WP | Test Librarian 46  |
#      | librarian47@library | qPL9cVwm | Test Librarian 47  |
#      | librarian48@library | h0lqSR63 | Test Librarian 48  |
#      | librarian49@library | 8l9bsLAN | Test Librarian 49  |
#      | librarian50@library | LXHU2DkJ | Test Librarian 50  |
#      | librarian51@library | vGTWHXgx | Test Librarian 51  |
#      | librarian52@library | p3c33VSf | Test Librarian 52  |
#      | librarian53@library | whtQ6kpH | Test Librarian 53  |
#      | librarian54@library | a6aZeunQ | Test Librarian 54  |
#      | librarian55@library | 67UQi3Ol | Test Librarian 55  |
#      | librarian56@library | pBQnq0NN | Test Librarian 56  |
#      | librarian57@library | SHzFWv8X | Test Librarian 57  |
#      | librarian58@library | gxiYGKjy | Test Librarian 58  |
#      | librarian59@library | DmSqxDEJ | Test Librarian 59  |
#      | librarian60@library | Lj5VU4Tq | Test Librarian 60  |



