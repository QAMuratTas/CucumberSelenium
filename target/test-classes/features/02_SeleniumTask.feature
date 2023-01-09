Feature: Google search test
 @samsung
  Scenario: Google da bir kelime arandığında ilgili kelimeyi barındıran sonuclar görüntülenmelidir.
    Given Kullanici google sayfasindadir
    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesi gectigini dogrular

    @nutella
  Scenario: Google da bir kelime arandığında ilgili kelimeyi barındıran sonuclar görüntülenmelidir.
    Given Kullanici google sayfasindadir
    When Kullanici nutella kelimesini arar
    Then Kullanici sayfada nutella kelimesi gectigini dogrular