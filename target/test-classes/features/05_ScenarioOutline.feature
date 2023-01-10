Feature: Google Arama Feature


  Scenario Outline:
    Given Kullanici google sayfasindadir
    When Kullanici "" arattiginda
    Then Kullanici title da "" gormelidir

    Examples:
    |aranacakKelime|dogrunalcakKelime|
