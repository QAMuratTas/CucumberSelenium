Feature: Google Arama Testi


  Scenario: Kullanıcı samsung aradğında samsung görmelidir
    Given Kullanici google sayfasindadir
    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesi gectigini dogrular

  Scenario: Kullanıcı samsung aradğında samsung görmelidir
    Given Kullanici google sayfasindadir
    When Kullanici cucumber kelimesini arar
    Then Kullanici sayfada cucumber kelimesi gectigini dogrular

  Scenario: Kullanıcı samsung aradğında samsung görmelidir
    Given Kullanici google sayfasindadir
    When Kullanici selenium kelimesini arar
    Then Kullanici sayfada selenium kelimesi gectigini dogrular
