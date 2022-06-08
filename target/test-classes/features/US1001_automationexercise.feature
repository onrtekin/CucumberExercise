Feature: US1001 Automationexercise Search


Scenario: TC01 kullanici gereken adimlari yaparak siteye kayit olur

  Given kullanici "automationUrl" sayfasina gider
  Then anasayfanin basariyla goruntulendigini dogrular
  And signup login button basar
  And yeni kullanici bolumunde name, email girerek signup buttonuna basar
  And Enter Account Information yazisinin gorunur oldugunu dogrular
  And kayit formunu doldurur
  And create account buttonuna basar
  And kullanici 5 sn bekler
  And sayfayi kapatir

Scenario: TC02 kullanici dogru email ve password ile login olur

  Given kullanici "automationUrl" sayfasina gider
  Then url'in "automation" icerdigini test eder
  And anasayfanin basariyla goruntulendigini dogrular
  And signup login button basar
  And dogru email girer
  And dogru password girer
  And login button basar
  And login oldugunu dogrular
  And sayfayi kapatir

Scenario: TC03 kullanici dogru email yanlis password ile login olamaz
  Given kullanici "automationUrl" sayfasina gider
  Then url'in "automation" icerdigini test eder
  And anasayfanin basariyla goruntulendigini dogrular
  And signup login button basar
  And dogru email girer
  And yanlis password girer
  And login button basar
  And login olamadigini dogrular
  And sayfayi kapatir


  Scenario: TC04 kullanici yanlis email dogru password ile login olamaz
    Given kullanici "automationUrl" sayfasina gider
    Then url'in "automation" icerdigini test eder
    And anasayfanin basariyla goruntulendigini dogrular
    And signup login button basar
    And yanlis email girer
    And dogru password girer
    And login button basar
    And login olamadigini dogrular
    And sayfayi kapatir

  Scenario: TC05 kullanici yanlis email yanlis password ile login olamaz
    Given kullanici "automationUrl" sayfasina gider
    Then url'in "automation" icerdigini test eder
    And anasayfanin basariyla goruntulendigini dogrular
    And signup login button basar
    And yanlis email girer
    And yanlis password girer
    And login button basar
    And login olamadigini dogrular
    And sayfayi kapatir

    Scenario: TC06 kullanici kayitli bilgileriyle yeniden kayit olamaz
      Given kullanici "automationUrl" sayfasina gider
      Then url'in "automation" icerdigini test eder
      And anasayfanin basariyla goruntulendigini dogrular
      And signup login button basar
      And new user signup yazisinin goruntulendigini dogrular
      And yeni kullanici bolumunde name, email girerek signup buttonuna basar
      And email adresi zaten var hatasinin gorunur oldugunu test eder
      And sayfayi kapatir


      Scenario: TC07 kullanici contact bolumundeki formu doldurarak yollar

        Given kullanici "automationUrl" sayfasina gider
        Then url'in "automation" icerdigini test eder
        And anasayfanin basariyla goruntulendigini dogrular
        And kullanici contact us butonuna basar
        And get in touch yazisinin grunur oldugunu test eder
        And kullanici name, email, subject,your message bolumlerini doldurur
        And kullanici submit butonuna basar
        And gelen uyari mesajina tamam i tiklar
        And basariyla gonderildigini gosteren yazinin gorunur oldugunu test eder
        And kullanici 2 sn bekler
        And home butonuna basar
        And anasayfanin basariyla goruntulendigini dogrular
        And sayfayi kapatir

        Scenario: TC08 kullanici urunler sayfasina gider urun inceler
          Given kullanici "automationUrl" sayfasina gider
          Then kullanici products butonuna basar
          And tum urunler sayfasinin goruntulendigini test eder
          And tum urunlerin goruntulendigini test eder
          And kullanici ilk urunu goruntuleye tiklar
          And ilk urunun detaylarinin goruntulendigini test eder
          And kullanici 2 sn bekler
          And sayfayi kapatir






























