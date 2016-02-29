Feature: Search in Google

  Scenario Outline: Search companies in Google
    Given I'm at Google webpage
    When I search for <companyName>
    Then <companySite> should appear in results

    Examples:
     | companyName          | companySite     |
     | Packlink España      | www.packlink.es |
     | Packlink Italia      | www.packlink.it |
     | Packlink France      | www.packlink.fr |
     | Packlink Deutschland | www.packlink.de |
