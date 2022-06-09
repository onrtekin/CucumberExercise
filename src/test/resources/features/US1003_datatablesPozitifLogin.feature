Feature: US1003 kullanici dataTables sayfasina kayitli bilgileriyle login olur


  Scenario: TC10 kullanici dogru bilgiler girerek giris yapabilmeli
    Given kullanici "dataTablesUrl" sayfasina gider
    Then datatables anasayfada oldugunu test eder
    And kullanici login register butonuna basar
    And kullanici dogru email girer
    And kullanici dogru password girer
    And kullanici sign in register butonuna basar
    And sayfayi kapatir


