Feature: US1002 kullanici datatables sayfasina kayit olur


  Scenario:TC09 kullanici datatables sayfasina gider gereken bilgileri doldurarak kayit olur
    Given kullanici "dataTablesUrl" sayfasina gider
    When datatables anasayfada oldugunu test eder
    And kullanici login register butonuna basar
    And kullanici kayit icin gerekli formu doldurur
    And kullanici sign in register butonuna basar
    And kullanici login oldugunu test eder
    And sayfayi kapatir
