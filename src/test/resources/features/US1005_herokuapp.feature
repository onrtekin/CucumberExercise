Feature: US1005 herokuapp sayfasinda eleman ekleyip silme
@vip
  Scenario:TC12 herokuapp sayfasina giderek istenen sayida eleman ekleyip silme

    Given kullanici "herokuUrl" sayfasina gider
    Then 100 defa add element butonuna basar
    And 100 defa delete element butonuna basar

