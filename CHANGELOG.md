# Changelog

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
