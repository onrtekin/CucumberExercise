Feature: US1002 kullanici datatables sayfasina kayit olur


  Scenario:TC09 kullanici datatables sayfasina gider gereken bilgileri doldurarak kayit olur
    Given kullanici "dataTablesUrl" sayfasina gider
    When datatables anasayfada oldugunu test eder
    And kullanici login register butonuna basar
    And kullanici kayit icin gerekli formu doldurur
    And kullanici sign in register butonuna basar
    And kullanici login oldugunu test eder
    And sayfayi kapatir

  @out
  Scenario Outline:TC13 kullanici datatables sayfasinda 5 farli giris kaydi yapabilmeli

    Given kullanici "dataTablesUrl" sayfasina gider
    Then new butonuna basar
    And isim bolumune "<isim>" girer
    And soyisim bolumune "<soyisim>" girer
    And pozisyon bolumune "<pozisyon>" girer
    And office bolumune "<office>" girer
    And extension bolumune "<extension>" girer
    And start date bolumune "<start date>" girer
    And salary bolumune "<salary>" girer
    And create buttonuna basar
    And kullanici "<isim>" ile arama yapar
    And isim bolumunde "<isim>" oldugunu test eder


    Examples:
      | isim      | soyisim | pozisyon   | office     | extension | start date | salary |
      | omer faik | tekin   | developer  | newyork    | java      | 2022-01-01 | 150000 |
      | nilufer   | tekin   | QA         | chicago    | phyton    | 2022-01-01 | 200000 |
      | secil     | gudul   | datascient | texas      | javascr   | 2022-01-01 | 220000 |
      | ridvan    | salt    | engineer   | boston     | dna       | 2022-01-01 | 250000 |
      | beril     | gudul   | teacher    | california | english   | 2022-01-01 | 100000 |




















