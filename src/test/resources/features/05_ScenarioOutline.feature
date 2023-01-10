Feature: Google Arama Feature

  Background:
    Given Kullanici google sayfasindadir

  Scenario Outline:
    Given Kullanici google sayfasindadir
    When Kullanici "<aranacakKelime>" arattiginda
    Then Kullanici title da "<dogrunalcakKelime>" gormelidir

    Examples:
    |aranacakKelime|dogrunalcakKelime|
    |cucumber      |cucumber         |
    |selenium      |selenium         |