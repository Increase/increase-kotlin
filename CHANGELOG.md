# Changelog

## 0.8.3 (2023-09-07)

Full Changelog: [v0.8.2...v0.8.3](https://github.com/increase/increase-kotlin/compare/v0.8.2...v0.8.3)

### Features

* **api:** add bank_of_first_deposit_routing_number and transfer_id properties ([#83](https://github.com/increase/increase-kotlin/issues/83)) ([d4cd559](https://github.com/increase/increase-kotlin/commit/d4cd559230902303c2ea0e47ebcfee578e11fc9c))
* **api:** add Update Address  and Create Notification Change endpoints ([#86](https://github.com/increase/increase-kotlin/issues/86)) ([630a3a1](https://github.com/increase/increase-kotlin/commit/630a3a18cf7494e010bc569df3392537079811b3))


### Documentation

* **api:** add docstrings and refine enum types ([#87](https://github.com/increase/increase-kotlin/issues/87)) ([4a7a14d](https://github.com/increase/increase-kotlin/commit/4a7a14dd902769f14aa4d4d15014d7118a32f4b0))

## 0.8.2 (2023-08-29)

Full Changelog: [v0.8.1...v0.8.2](https://github.com/Increase/increase-kotlin/compare/v0.8.1...v0.8.2)

### Features

* **api:** remove unused `/inbound_ach_transfer_returns` endpoints ([#82](https://github.com/Increase/increase-kotlin/issues/82)) ([b092a05](https://github.com/Increase/increase-kotlin/commit/b092a05da97ad4198c6b540dc937340aee51d32f))


### Bug Fixes

* **api:** move ACH Return endpoint and add digital wallet properties ([#81](https://github.com/Increase/increase-kotlin/issues/81)) ([d89e39b](https://github.com/Increase/increase-kotlin/commit/d89e39b794eedf457148d7ebcbe6a252c62466ad))


### Chores

* **ci:** setup workflows to create releases and release PRs ([#78](https://github.com/Increase/increase-kotlin/issues/78)) ([e64ac5f](https://github.com/Increase/increase-kotlin/commit/e64ac5f7575df513090fae438736bdd75b1b5f03))

## [0.8.1](https://github.com/Increase/increase-kotlin/compare/v0.8.0...v0.8.1) (2023-08-27)


### Features

* **api:** move inbound ACH transfer returns (⚠️ breaking); add ACH transfer declines ([#76](https://github.com/Increase/increase-kotlin/issues/76)) ([a050465](https://github.com/Increase/increase-kotlin/commit/a050465045c97a948dbc6f85cbeab017da8d6623))
* **api:** updates ([#74](https://github.com/Increase/increase-kotlin/issues/74)) ([49269a8](https://github.com/Increase/increase-kotlin/commit/49269a818cb3114d5764dc91f6084daab31afae6))


### Chores

* **internal:** minor code re-ordering ([#75](https://github.com/Increase/increase-kotlin/issues/75)) ([d2270e8](https://github.com/Increase/increase-kotlin/commit/d2270e852cb1cbc97244d2f7f062c51585581461))

## [0.8.0](https://github.com/Increase/increase-kotlin/compare/v0.7.3...v0.8.0) (2023-08-17)


### ⚠ BREAKING CHANGES

* **api:** change `physical_cards.status` value, remove `event_subscription` field, add fields ([#69](https://github.com/Increase/increase-kotlin/issues/69))

### Features

* **api:** change `physical_cards.status` value, remove `event_subscription` field, add fields ([#69](https://github.com/Increase/increase-kotlin/issues/69)) ([3df1f0b](https://github.com/Increase/increase-kotlin/commit/3df1f0b56b65df7c9f839e6cc341fa53e257a9bc))

## [0.7.3](https://github.com/Increase/increase-kotlin/compare/v0.7.2...v0.7.3) (2023-08-16)


### Features

* default timeout is set for java clients ([#63](https://github.com/Increase/increase-kotlin/issues/63)) ([3a68122](https://github.com/Increase/increase-kotlin/commit/3a6812252b5598115168437e65e0b278ad41eb0d))
* generate addXxx methods for array types ([#66](https://github.com/Increase/increase-kotlin/issues/66)) ([79d0d81](https://github.com/Increase/increase-kotlin/commit/79d0d81790f1ee5da5360fb4b6d49e2fc7981600))


### Bug Fixes

* set correct timeouts on okhttp client ([#67](https://github.com/Increase/increase-kotlin/issues/67)) ([afef21d](https://github.com/Increase/increase-kotlin/commit/afef21d8f62b285548ac3a5a3edc60135b12d904))


### Chores

* assign default reviewers to release PRs ([#65](https://github.com/Increase/increase-kotlin/issues/65)) ([5f903ae](https://github.com/Increase/increase-kotlin/commit/5f903aef6d2f8358513bada6880add0fd401492f))

## [0.7.2](https://github.com/Increase/increase-kotlin/compare/v0.7.1...v0.7.2) (2023-08-11)


### Features

* **api:** updates ([#59](https://github.com/Increase/increase-kotlin/issues/59)) ([650a14c](https://github.com/Increase/increase-kotlin/commit/650a14c085b06acfcc491a2dab780e1dac8e6593))


### Documentation

* **api:** change description of various fields ([#61](https://github.com/Increase/increase-kotlin/issues/61)) ([c1ee5b7](https://github.com/Increase/increase-kotlin/commit/c1ee5b7ff0bb30cba810497165b778231979794d))

## [0.7.1](https://github.com/Increase/increase-kotlin/compare/v0.7.0...v0.7.1) (2023-08-08)


### Features

* **api:** updates ([#55](https://github.com/Increase/increase-kotlin/issues/55)) ([b56d956](https://github.com/Increase/increase-kotlin/commit/b56d95600620961940e0efb7ceafde9974d9ec88))
* **ci:** add a publish-sonatype workflow for manual running ([#47](https://github.com/Increase/increase-kotlin/issues/47)) ([aca1537](https://github.com/Increase/increase-kotlin/commit/aca1537398469c3a920e588b37999ad1e3286e5e))
* **test:** unskip file uploads tests ([#49](https://github.com/Increase/increase-kotlin/issues/49)) ([c805758](https://github.com/Increase/increase-kotlin/commit/c805758372ff1e0350405f62ae5f106e09ac7c83))


### Chores

* **ci:** allow release to proceed without signing key id secret ([#56](https://github.com/Increase/increase-kotlin/issues/56)) ([d85fe88](https://github.com/Increase/increase-kotlin/commit/d85fe882874543c45c10b972739c9f78fa0e9a70))
* **internal:** add `codegen.log` to `.gitignore` ([#45](https://github.com/Increase/increase-kotlin/issues/45)) ([6978144](https://github.com/Increase/increase-kotlin/commit/69781448cae4644990dd259f295cbf6cc1ec6358))
* **internal:** publish with --stacktrace for more helpful error information ([#52](https://github.com/Increase/increase-kotlin/issues/52)) ([efc6b11](https://github.com/Increase/increase-kotlin/commit/efc6b11fb5d0212e1bfb76b93943736acbaab0ad))
* **internal:** reorganize types ([#57](https://github.com/Increase/increase-kotlin/issues/57)) ([d060ea1](https://github.com/Increase/increase-kotlin/commit/d060ea16c4b26607a66ef751eb65d9fbfccc28fe))
* **internal:** support passing GPG_SIGNING_KEY_ID from secrets ([#54](https://github.com/Increase/increase-kotlin/issues/54)) ([2db452c](https://github.com/Increase/increase-kotlin/commit/2db452c7a42dfc38f9593031a5622a0ed6da0801))


### Documentation

* **readme:** remove beta status + document versioning policy ([#58](https://github.com/Increase/increase-kotlin/issues/58)) ([4789614](https://github.com/Increase/increase-kotlin/commit/47896146a771ace4a6df32dbc899c831aa378aed))

## [0.7.0](https://github.com/Increase/increase-kotlin/compare/v0.6.1...v0.7.0) (2023-07-22)


### ⚠ BREAKING CHANGES

* **api:** reorganize `check_transfer` and `network fields; add `request_details`; add `unknown` ([#39](https://github.com/Increase/increase-kotlin/issues/39))

### Features

* **api:** add fee_period_start and return_of_erroneous_or_reversing_debit ([#43](https://github.com/Increase/increase-kotlin/issues/43)) ([39c32a9](https://github.com/Increase/increase-kotlin/commit/39c32a973a6bc7e6812a24c0d29535f4b81f6129))
* **api:** reorganize `check_transfer` and `network fields; add `request_details`; add `unknown` ([#39](https://github.com/Increase/increase-kotlin/issues/39)) ([dd538f4](https://github.com/Increase/increase-kotlin/commit/dd538f429c32daed264c2977dd3cabb5339c3080))


### Bug Fixes

* auto-close responses even if an exception is thrown during deserialization ([#41](https://github.com/Increase/increase-kotlin/issues/41)) ([9e17d1a](https://github.com/Increase/increase-kotlin/commit/9e17d1aa1d97fa86b4f1afb2fcd941b6a7ecceae))


### Documentation

* **api:** update `model_id` documentation ([#42](https://github.com/Increase/increase-kotlin/issues/42)) ([d0df821](https://github.com/Increase/increase-kotlin/commit/d0df821897b9fc24c59417fc2e8c6d7b1e294792))

## [0.6.1](https://github.com/Increase/increase-kotlin/compare/v0.6.0...v0.6.1) (2023-07-17)


### Features

* **api:** add physical_card_id ([#34](https://github.com/Increase/increase-kotlin/issues/34)) ([924fd46](https://github.com/Increase/increase-kotlin/commit/924fd46b34e2a234f10692716f12d71a55798627))


### Chores

* **internal:** minor reformatting ([#37](https://github.com/Increase/increase-kotlin/issues/37)) ([3ddfa8f](https://github.com/Increase/increase-kotlin/commit/3ddfa8f76f29cb0ff7edd44bf720c1a200a182c1))
* **internal:** minor reformatting + remove internal examples classes ([#36](https://github.com/Increase/increase-kotlin/issues/36)) ([3c1c615](https://github.com/Increase/increase-kotlin/commit/3c1c6156a584dee5e4f6951ad9da941061d37b3c))

## [0.6.0](https://github.com/Increase/increase-kotlin/compare/v0.5.0...v0.6.0) (2023-07-12)


### ⚠ BREAKING CHANGES

* **api:** add unique_identifier, driver's license backs, inbound funds holds, and more ([#31](https://github.com/Increase/increase-kotlin/issues/31))

### Features

* **api:** add unique_identifier, driver's license backs, inbound funds holds, and more ([#31](https://github.com/Increase/increase-kotlin/issues/31)) ([2ca5f23](https://github.com/Increase/increase-kotlin/commit/2ca5f238dbef90ef3af6646ba96d9a8477f70ead))

## [0.5.0](https://github.com/Increase/increase-kotlin/compare/v0.4.0...v0.5.0) (2023-07-07)


### ⚠ BREAKING CHANGES

* **api:** add card profiles simulation method ([#28](https://github.com/Increase/increase-kotlin/issues/28))

### Features

* **api:** add card profiles simulation method ([#28](https://github.com/Increase/increase-kotlin/issues/28)) ([574d377](https://github.com/Increase/increase-kotlin/commit/574d3776fd41933e5cf7ee6ac54d7301d4cfb6df))

## [0.4.0](https://github.com/Increase/increase-kotlin/compare/v0.3.0...v0.4.0) (2023-06-29)


### ⚠ BREAKING CHANGES

* **api:** remove many enum members from document category ([#25](https://github.com/Increase/increase-kotlin/issues/25))

### Features

* **api/types:** mark more check transfer intention properties as nullable ([#24](https://github.com/Increase/increase-kotlin/issues/24)) ([9dca61f](https://github.com/Increase/increase-kotlin/commit/9dca61f75f2df5bf572abc55b0b8b1e14a6af825))


### Refactors

* **api:** remove `other` from reason enum ([#22](https://github.com/Increase/increase-kotlin/issues/22)) ([17fb581](https://github.com/Increase/increase-kotlin/commit/17fb581030f83acfbd32b3b3853a9a3a2b43df95))
* **api:** remove many enum members from document category ([#25](https://github.com/Increase/increase-kotlin/issues/25)) ([53f7582](https://github.com/Increase/increase-kotlin/commit/53f7582d6e7a6478722e4cdaaf3c5a39066deb3f))


### Documentation

* add trailing newlines ([#26](https://github.com/Increase/increase-kotlin/issues/26)) ([3eac110](https://github.com/Increase/increase-kotlin/commit/3eac1104b49f98c27fcb438055187d950019e0b4))

## [0.3.0](https://github.com/Increase/increase-kotlin/compare/v0.2.0...v0.3.0) (2023-06-19)


### ⚠ BREAKING CHANGES

* **api:** rename return reason enum member ([#19](https://github.com/Increase/increase-kotlin/issues/19))

### Features

* **api:** add new endpoints + properties + enums ([#13](https://github.com/Increase/increase-kotlin/issues/13)) ([70cd75f](https://github.com/Increase/increase-kotlin/commit/70cd75f5bb256be0483f6467d9c138ce610446c5))


### Bug Fixes

* **metadata:** correct scm URL ([#11](https://github.com/Increase/increase-kotlin/issues/11)) ([ca56eec](https://github.com/Increase/increase-kotlin/commit/ca56eec435984535401181165860314b453bed14))


### Chores

* **internal:** remove unused check-test-server script ([#15](https://github.com/Increase/increase-kotlin/issues/15)) ([c912af8](https://github.com/Increase/increase-kotlin/commit/c912af8d3341aaba8078ef5b23f44b177f276ac6))


### Documentation

* point to github repo instead of email contact ([#20](https://github.com/Increase/increase-kotlin/issues/20)) ([78f1806](https://github.com/Increase/increase-kotlin/commit/78f18063682fc9f41250892ce7ba75fee61e4141))


### Refactors

* **api:** remove unused properties and enum members ([#21](https://github.com/Increase/increase-kotlin/issues/21)) ([b4fa416](https://github.com/Increase/increase-kotlin/commit/b4fa416e21fbed5d1d4e19b72fecea6048214e50))
* **api:** rename return reason enum member ([#19](https://github.com/Increase/increase-kotlin/issues/19)) ([77624f7](https://github.com/Increase/increase-kotlin/commit/77624f7c9d381fb9ee2976b89334b3e955f45f30))

## [0.2.0](https://github.com/Increase/increase-kotlin/compare/v0.1.0...v0.2.0) (2023-05-31)


### ⚠ BREAKING CHANGES

* improve pagination response types
* rename nested params classes to use singular instead of plural
* rename At3dsCapableMerchant and FormSs4 with correct casing
* **api:** replace notification_of_change with a list, and add merchant_acceptor_id

### Features

* add async AutoPager implementation ([3117134](https://github.com/Increase/increase-kotlin/commit/3117134c038f1c88fc697ca532923096fc828db1))
* add async AutoPager implementation ([3117134](https://github.com/Increase/increase-kotlin/commit/3117134c038f1c88fc697ca532923096fc828db1))
* add JsonValue.convert method ([41e8c05](https://github.com/Increase/increase-kotlin/commit/41e8c054187451b7920e5e362fdcf47ca4163605))
* add methods to convert between sync and async clients ([97fa182](https://github.com/Increase/increase-kotlin/commit/97fa1823183cb1f99ae30e64f4515e6daa8abae8))
* add sonatype urls to build.gradle.kts ([44d214a](https://github.com/Increase/increase-kotlin/commit/44d214a3cda9f728ac32ef3caa0ee60c14e9f855))
* add support for proxies ([9d0a50a](https://github.com/Increase/increase-kotlin/commit/9d0a50a48539242591211573d57488a1aa4ba4db))
* add support for proxies ([9d0a50a](https://github.com/Increase/increase-kotlin/commit/9d0a50a48539242591211573d57488a1aa4ba4db))
* add timeout to RequestOptions ([09f65dd](https://github.com/Increase/increase-kotlin/commit/09f65dd361887b48092e57852fd5428586176962))
* **api:** add `at_time` property for balance lookups ([092f450](https://github.com/Increase/increase-kotlin/commit/092f4509262107166f4154471866e03b1bce4c49))
* **api:** add `collection_receivable` to transaction source category enum ([48a295d](https://github.com/Increase/increase-kotlin/commit/48a295d67978372016a6f451b1563f98c9f24fc8))
* **api:** add `expires_at` property ([685de3f](https://github.com/Increase/increase-kotlin/commit/685de3f9f0db73bb4fa321571d35c16628d25e87))
* **api:** add bookkeeping accounts, entries, and entry sets, and several other changes ([021350d](https://github.com/Increase/increase-kotlin/commit/021350d23221bb395c6e1b65b28be7a3d6892e02))
* **api:** add new enum members ([3b6287e](https://github.com/Increase/increase-kotlin/commit/3b6287eb77bca65ad380fd3fd4a60d44e2b96371))
* **api:** add new fields ([f7770cd](https://github.com/Increase/increase-kotlin/commit/f7770cdb501e47350bedca5ef623e59d0ad067e7))
* **api:** add optional `pending_transaction_id` field to pending transaction ([1e6bac2](https://github.com/Increase/increase-kotlin/commit/1e6bac2862be87cbe0866cab737210e51a59b973))
* **api:** add wire decline object ([db56130](https://github.com/Increase/increase-kotlin/commit/db56130d8463c5447ce6f9fe92b1cbd9d0739c3c))
* **api:** enum updates ([1440eaa](https://github.com/Increase/increase-kotlin/commit/1440eaa4198d319c7c60605d17873bf48d8b3db3))
* **api:** remove cardSettlementTransactionId ([f566f4f](https://github.com/Increase/increase-kotlin/commit/f566f4f45a8c5f4a2d712c84ced2b662578fdfbd))
* **api:** replace notification_of_change with a list, and add merchant_acceptor_id ([6ff9642](https://github.com/Increase/increase-kotlin/commit/6ff9642c6d8345134d72d420cb70b69a91ef0679))
* **api:** updates ([d43e046](https://github.com/Increase/increase-kotlin/commit/d43e04659c68366783b736beaf65072c3165d43b))
* **core:** add `asUnknown` to `JsonField` ([69377cb](https://github.com/Increase/increase-kotlin/commit/69377cb2d9b3c44348b2b8871ef1e39b1648f231))
* **docs:** updates ([f02d8f2](https://github.com/Increase/increase-kotlin/commit/f02d8f256eafaf2a5d121effe53da2e54682d14e))
* improve pagination response types ([94cc040](https://github.com/Increase/increase-kotlin/commit/94cc04066a59c30a20278ca6f425f533587d6afe))
* **tests:** support specifying `SKIP_MOCK_TESTS=true` ([aecbb88](https://github.com/Increase/increase-kotlin/commit/aecbb88e7abcca85cf9bd35786bc1b70e367f325))
* use latest Java LTS to build SDK ([5d6c656](https://github.com/Increase/increase-kotlin/commit/5d6c6568ec0afc6f5c45c9c19e0c49a7adc62738))
* use latest Java LTS to build SDK ([5d6c656](https://github.com/Increase/increase-kotlin/commit/5d6c6568ec0afc6f5c45c9c19e0c49a7adc62738))


### Bug Fixes

* remove unnecessary annotations ([ea2dd7b](https://github.com/Increase/increase-kotlin/commit/ea2dd7b8e24a32daf3259815d1c2abfada5f7825))
* rename At3dsCapableMerchant and FormSs4 with correct casing ([6a16c13](https://github.com/Increase/increase-kotlin/commit/6a16c133e468d651cfc8e8ef51951a6ff2308506))


### Refactors

* **pagination:** remove special casing of empty string cursors ([466d690](https://github.com/Increase/increase-kotlin/commit/466d69036259a11fd3af96adaddb8ed7203ca0a5))
* rename nested params classes to use singular instead of plural ([85aefe1](https://github.com/Increase/increase-kotlin/commit/85aefe1a2f2a79f5f934d0ef4d90af31cda184ff))
