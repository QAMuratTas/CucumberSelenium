Feature: Google Arama Testi

Background:  Kullanici  her senaryoda google sitesinde olacaktir
  Given Kullanici google sayfasindadir

  Scenario: Kullanıcı samsung aradğında samsung görmelidir

    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesi gectigini dogrular

  Scenario: Kullanıcı samsung aradğında samsung görmelidir

    When Kullanici cucumber kelimesini arar
    Then Kullanici sayfada cucumber kelimesi gectigini dogrular

  Scenario: Kullanıcı samsung aradğında samsung görmelidir

    When Kullanici selenium kelimesini arar
    Then Kullanici sayfada selenium kelimesi gectigini dogrular
