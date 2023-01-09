Feature: Google search test
  Scenario: Google da bir kelime arandığında ilgili kelimeyi barındıran sonuclar görüntülenmelidir.
    Given Kullanici google sayfasindadir
    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesi gectigini dogrular