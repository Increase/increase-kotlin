# Changelog

## 0.0.1 (2024-02-15)

Full Changelog: [...abc-v0.0.1](https://github.com/Increase/increase-kotlin/compare/...abc-v0.0.1)

### ⚠ BREAKING CHANGES

* **api:** split card profile resource into digital and physical card profile resources ([#183](https://github.com/Increase/increase-kotlin/issues/183))
* fix oauth casing ([#168](https://github.com/Increase/increase-kotlin/issues/168))
* **api:** remove Limits API, add ACH controls to Account Numbers   ([#88](https://github.com/Increase/increase-kotlin/issues/88))
* **api:** change `physical_cards.status` value, remove `event_subscription` field, add fields ([#69](https://github.com/Increase/increase-kotlin/issues/69))
* **api:** reorganize `check_transfer` and `network fields; add `request_details`; add `unknown` ([#39](https://github.com/Increase/increase-kotlin/issues/39))
* **api:** add unique_identifier, driver's license backs, inbound funds holds, and more ([#31](https://github.com/Increase/increase-kotlin/issues/31))
* **api:** add card profiles simulation method ([#28](https://github.com/Increase/increase-kotlin/issues/28))
* **api:** remove many enum members from document category ([#25](https://github.com/Increase/increase-kotlin/issues/25))
* **api:** rename return reason enum member ([#19](https://github.com/Increase/increase-kotlin/issues/19))
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
* add sonatype urls to build.gradle.kts ([7b2c2bf](https://github.com/Increase/increase-kotlin/commit/7b2c2bfec9b824b7ab84dbdf7f86647c25cbc4b7))
* add support for proxies ([9d0a50a](https://github.com/Increase/increase-kotlin/commit/9d0a50a48539242591211573d57488a1aa4ba4db))
* add support for proxies ([9d0a50a](https://github.com/Increase/increase-kotlin/commit/9d0a50a48539242591211573d57488a1aa4ba4db))
* add timeout to RequestOptions ([09f65dd](https://github.com/Increase/increase-kotlin/commit/09f65dd361887b48092e57852fd5428586176962))
* **api/types:** mark more check transfer intention properties as nullable ([#24](https://github.com/Increase/increase-kotlin/issues/24)) ([9dca61f](https://github.com/Increase/increase-kotlin/commit/9dca61f75f2df5bf572abc55b0b8b1e14a6af825))
* **api:** add `ach_debit_status` ([#152](https://github.com/Increase/increase-kotlin/issues/152)) ([48c5973](https://github.com/Increase/increase-kotlin/commit/48c5973dfa0dc4e761aa2c1f8b31a9eda4a93b86))
* **api:** add `at_time` property for balance lookups ([092f450](https://github.com/Increase/increase-kotlin/commit/092f4509262107166f4154471866e03b1bce4c49))
* **api:** add `collection_receivable` to transaction source category enum ([48a295d](https://github.com/Increase/increase-kotlin/commit/48a295d67978372016a6f451b1563f98c9f24fc8))
* **api:** add `expires_at` property ([685de3f](https://github.com/Increase/increase-kotlin/commit/685de3f9f0db73bb4fa321571d35c16628d25e87))
* **api:** add `simulations.check_transfers.return_()` method ([532d3e2](https://github.com/Increase/increase-kotlin/commit/532d3e2d11d5a31f228e652884741846723505b2))
* **api:** add `simulations.check_transfers.return_()` method ([532d3e2](https://github.com/Increase/increase-kotlin/commit/532d3e2d11d5a31f228e652884741846723505b2))
* **api:** add `suspected_fraud` rejection reason ([#144](https://github.com/Increase/increase-kotlin/issues/144)) ([b03532f](https://github.com/Increase/increase-kotlin/commit/b03532f6d299994ff08fdcbdd2b7dc565f2ca118))
* **api:** add addenda details for ACH transfers ([#117](https://github.com/Increase/increase-kotlin/issues/117)) ([cffe354](https://github.com/Increase/increase-kotlin/commit/cffe354f74c5592d110ffeb6635ac9b2f8d32d0c))
* **api:** add bank_of_first_deposit_routing_number and transfer_id properties ([#83](https://github.com/Increase/increase-kotlin/issues/83)) ([6b0c4fc](https://github.com/Increase/increase-kotlin/commit/6b0c4fc4159357be1d9e30c6b1498a7f86234d3b))
* **api:** add bookkeeping accounts, entries, and entry sets, and several other changes ([021350d](https://github.com/Increase/increase-kotlin/commit/021350d23221bb395c6e1b65b28be7a3d6892e02))
* **api:** add card payment ID reference to transaction models ([#90](https://github.com/Increase/increase-kotlin/issues/90)) ([6e2bd96](https://github.com/Increase/increase-kotlin/commit/6e2bd96e41ce2490a75ca6675fbca26e2f83025d))
* **api:** add card payments endpoints ([#102](https://github.com/Increase/increase-kotlin/issues/102)) ([9e7a6a9](https://github.com/Increase/increase-kotlin/commit/9e7a6a93cc5ff2158b01eafc964fde477cade2b4))
* **api:** add card profiles simulation method ([#28](https://github.com/Increase/increase-kotlin/issues/28)) ([574d377](https://github.com/Increase/increase-kotlin/commit/574d3776fd41933e5cf7ee6ac54d7301d4cfb6df))
* **api:** add deposit_submission property to check deposit ([#148](https://github.com/Increase/increase-kotlin/issues/148)) ([b53b6ac](https://github.com/Increase/increase-kotlin/commit/b53b6ac8c3752ee6f735a12b0a40289b4aca0f38))
* **api:** add direction property to CardAuthorization ([#108](https://github.com/Increase/increase-kotlin/issues/108)) ([bc65e66](https://github.com/Increase/increase-kotlin/commit/bc65e668072ec5058a5da3d4955f2f48d4f9a279))
* **api:** add entity_id to Card and make relationship nullable ([#95](https://github.com/Increase/increase-kotlin/issues/95)) ([c7d4912](https://github.com/Increase/increase-kotlin/commit/c7d49121634856cea5f7cb6596e51a3a3f311ff9))
* **api:** add failed to export status enum ([#134](https://github.com/Increase/increase-kotlin/issues/134)) ([3a9cc86](https://github.com/Increase/increase-kotlin/commit/3a9cc86770ca53b32803c97129a2a98108ce23fb))
* **api:** add fee_period_start and return_of_erroneous_or_reversing_debit ([#43](https://github.com/Increase/increase-kotlin/issues/43)) ([39c32a9](https://github.com/Increase/increase-kotlin/commit/39c32a973a6bc7e6812a24c0d29535f4b81f6129))
* **api:** add fuel confirmation functionality ([#124](https://github.com/Increase/increase-kotlin/issues/124)) ([d442f41](https://github.com/Increase/increase-kotlin/commit/d442f41e6a09036bfb5d0bb09fdd4ff35d34367a))
* **api:** add inbound checks, originating routing number and new event types ([#98](https://github.com/Increase/increase-kotlin/issues/98)) ([dfc0517](https://github.com/Increase/increase-kotlin/commit/dfc051738e47fc024e35368e7f621994ac3dc410))
* **api:** add merchant data to simulation api ([#162](https://github.com/Increase/increase-kotlin/issues/162)) ([88dce69](https://github.com/Increase/increase-kotlin/commit/88dce69eba3892931f53348246e6663e9d0651af))
* **api:** add network identifiers and effective date ([#130](https://github.com/Increase/increase-kotlin/issues/130)) ([be10bbc](https://github.com/Increase/increase-kotlin/commit/be10bbc41edb3d0bbf533b82508aae3a713fafa8))
* **api:** add new endpoints + properties + enums ([#13](https://github.com/Increase/increase-kotlin/issues/13)) ([70cd75f](https://github.com/Increase/increase-kotlin/commit/70cd75f5bb256be0483f6467d9c138ce610446c5))
* **api:** add new enum members ([3b6287e](https://github.com/Increase/increase-kotlin/commit/3b6287eb77bca65ad380fd3fd4a60d44e2b96371))
* **api:** add new fields ([f7770cd](https://github.com/Increase/increase-kotlin/commit/f7770cdb501e47350bedca5ef623e59d0ad067e7))
* **api:** add oauth token and inbound wire transfer methods ([#170](https://github.com/Increase/increase-kotlin/issues/170)) ([d18460c](https://github.com/Increase/increase-kotlin/commit/d18460c51deac27bc27f44f2c631aae13b34e9af))
* **api:** add optional `pending_transaction_id` field to pending transaction ([1e6bac2](https://github.com/Increase/increase-kotlin/commit/1e6bac2862be87cbe0866cab737210e51a59b973))
* **api:** add physical cards endpoints ([#100](https://github.com/Increase/increase-kotlin/issues/100)) ([3541101](https://github.com/Increase/increase-kotlin/commit/3541101b89c723f97f47a620e093d8ec8a86af70))
* **api:** add physical_card_id ([#34](https://github.com/Increase/increase-kotlin/issues/34)) ([924fd46](https://github.com/Increase/increase-kotlin/commit/924fd46b34e2a234f10692716f12d71a55798627))
* **api:** add real-time payments request for payment endpoints ([#151](https://github.com/Increase/increase-kotlin/issues/151)) ([038ceb9](https://github.com/Increase/increase-kotlin/commit/038ceb953662cb0a0e54e9d8b12860fbc4b01f61))
* **api:** add returned_per_odfi_request enum ([#123](https://github.com/Increase/increase-kotlin/issues/123)) ([4a22924](https://github.com/Increase/increase-kotlin/commit/4a22924b2390a47580e0f3f0ba2437de8554ad47))
* **api:** add unique_identifier, driver's license backs, inbound funds holds, and more ([#31](https://github.com/Increase/increase-kotlin/issues/31)) ([2ca5f23](https://github.com/Increase/increase-kotlin/commit/2ca5f238dbef90ef3af6646ba96d9a8477f70ead))
* **api:** add Update Address  and Create Notification Change endpoints ([#86](https://github.com/Increase/increase-kotlin/issues/86)) ([2a03f96](https://github.com/Increase/increase-kotlin/commit/2a03f9622d9425f9844c7095e40128b97f83f456))
* **api:** add wire decline object ([db56130](https://github.com/Increase/increase-kotlin/commit/db56130d8463c5447ce6f9fe92b1cbd9d0739c3c))
* **api:** allow webhook unwrapping without providing secret ([#158](https://github.com/Increase/increase-kotlin/issues/158)) ([2485a8e](https://github.com/Increase/increase-kotlin/commit/2485a8e6df80295b9f558d3bf2f5a0f6114a2d55))
* **api:** change `physical_cards.status` value, remove `event_subscription` field, add fields ([#69](https://github.com/Increase/increase-kotlin/issues/69)) ([3df1f0b](https://github.com/Increase/increase-kotlin/commit/3df1f0b56b65df7c9f839e6cc341fa53e257a9bc))
* **api:** enum updates ([1440eaa](https://github.com/Increase/increase-kotlin/commit/1440eaa4198d319c7c60605d17873bf48d8b3db3))
* **api:** expand event categories and Entity status options ([#106](https://github.com/Increase/increase-kotlin/issues/106)) ([9f6f6f9](https://github.com/Increase/increase-kotlin/commit/9f6f6f970d483a37457d3e6c1a3dc1aafe3634f9))
* **api:** export account statements in OFX format ([#97](https://github.com/Increase/increase-kotlin/issues/97)) ([0d2d81d](https://github.com/Increase/increase-kotlin/commit/0d2d81dd3a29f246f8e9d5c4de00b15d6791d190))
* **api:** list Inbound Wire Transfers, change transfer simulation return types ([#173](https://github.com/Increase/increase-kotlin/issues/173)) ([614b58a](https://github.com/Increase/increase-kotlin/commit/614b58a4cc9b26bf0d20c18ad3d39d4e18cb2245))
* **api:** make routeType an enum & add ACHTransfer.effectiveDate ([18b6e08](https://github.com/Increase/increase-kotlin/commit/18b6e083dc31947a40dc3bd186ef1d88e13a051b))
* **api:** make routeType an enum & add ACHTransfer.effectiveDate ([18b6e08](https://github.com/Increase/increase-kotlin/commit/18b6e083dc31947a40dc3bd186ef1d88e13a051b))
* **api:** move inbound ACH transfer returns (⚠️ breaking); add ACH transfer declines ([#76](https://github.com/Increase/increase-kotlin/issues/76)) ([a050465](https://github.com/Increase/increase-kotlin/commit/a050465045c97a948dbc6f85cbeab017da8d6623))
* **api:** new methods for handling webhooks ([#157](https://github.com/Increase/increase-kotlin/issues/157)) ([c69cfc5](https://github.com/Increase/increase-kotlin/commit/c69cfc5edb0aac9de9739a01be361cd5c9e7d7c7))
* **api:** remove cardSettlementTransactionId ([f566f4f](https://github.com/Increase/increase-kotlin/commit/f566f4f45a8c5f4a2d712c84ced2b662578fdfbd))
* **api:** remove Limits API, add ACH controls to Account Numbers   ([#88](https://github.com/Increase/increase-kotlin/issues/88)) ([6de8e64](https://github.com/Increase/increase-kotlin/commit/6de8e64214357ce8cd740f39e3be523b2eb9cd53))
* **api:** remove unused `/inbound_ach_transfer_returns` endpoints ([#82](https://github.com/Increase/increase-kotlin/issues/82)) ([cb6f911](https://github.com/Increase/increase-kotlin/commit/cb6f9117b19485e74e25811b89aecde2ac065159))
* **api:** reorganize `check_transfer` and `network fields; add `request_details`; add `unknown` ([#39](https://github.com/Increase/increase-kotlin/issues/39)) ([dd538f4](https://github.com/Increase/increase-kotlin/commit/dd538f429c32daed264c2977dd3cabb5339c3080))
* **api:** replace notification_of_change with a list, and add merchant_acceptor_id ([6ff9642](https://github.com/Increase/increase-kotlin/commit/6ff9642c6d8345134d72d420cb70b69a91ef0679))
* **api:** restructure balance lookups ([#138](https://github.com/Increase/increase-kotlin/issues/138)) ([7bddbaa](https://github.com/Increase/increase-kotlin/commit/7bddbaabfa6aa405da094998e124bdce06c60f18))
* **api:** simplify WireDecline and InboundWireTransfer ([#171](https://github.com/Increase/increase-kotlin/issues/171)) ([5878555](https://github.com/Increase/increase-kotlin/commit/587855569778dc25b33cf9b4d677f5f1bee42674))
* **api:** split card profile resource into digital and physical card profile resources ([#183](https://github.com/Increase/increase-kotlin/issues/183)) ([04b2347](https://github.com/Increase/increase-kotlin/commit/04b234712530659f9a855fb0b223b420beef51fe))
* **api:** update descriptions ([#175](https://github.com/Increase/increase-kotlin/issues/175)) ([d9d91b7](https://github.com/Increase/increase-kotlin/commit/d9d91b7e492a6df41ae2cff74171378b7d9cc837))
* **api:** updates ([d43e046](https://github.com/Increase/increase-kotlin/commit/d43e04659c68366783b736beaf65072c3165d43b))
* **api:** updates ([#118](https://github.com/Increase/increase-kotlin/issues/118)) ([94751ff](https://github.com/Increase/increase-kotlin/commit/94751ffb6fc17e7c8b43e3ca4f07584cffd2e8de))
* **api:** updates ([#121](https://github.com/Increase/increase-kotlin/issues/121)) ([ce8ba3c](https://github.com/Increase/increase-kotlin/commit/ce8ba3c9c03296c3692fe24d76808ba1f8ac522a))
* **api:** updates ([#122](https://github.com/Increase/increase-kotlin/issues/122)) ([d630d96](https://github.com/Increase/increase-kotlin/commit/d630d963e22adf006cfc1cc1f7037589c35d20a1))
* **api:** updates ([#128](https://github.com/Increase/increase-kotlin/issues/128)) ([1d62eca](https://github.com/Increase/increase-kotlin/commit/1d62eca258b0bcf7e38134f2f2954db73e07eb24))
* **api:** updates ([#143](https://github.com/Increase/increase-kotlin/issues/143)) ([e2ea944](https://github.com/Increase/increase-kotlin/commit/e2ea944ff76cd2540bda157d8713b5de97853ba8))
* **api:** updates ([#55](https://github.com/Increase/increase-kotlin/issues/55)) ([b56d956](https://github.com/Increase/increase-kotlin/commit/b56d95600620961940e0efb7ceafde9974d9ec88))
* **api:** updates ([#59](https://github.com/Increase/increase-kotlin/issues/59)) ([650a14c](https://github.com/Increase/increase-kotlin/commit/650a14c085b06acfcc491a2dab780e1dac8e6593))
* **api:** updates ([#74](https://github.com/Increase/increase-kotlin/issues/74)) ([49269a8](https://github.com/Increase/increase-kotlin/commit/49269a818cb3114d5764dc91f6084daab31afae6))
* **ci:** add a publish-sonatype workflow for manual running ([#47](https://github.com/Increase/increase-kotlin/issues/47)) ([aca1537](https://github.com/Increase/increase-kotlin/commit/aca1537398469c3a920e588b37999ad1e3286e5e))
* **client:** adjust retry behavior ([#125](https://github.com/Increase/increase-kotlin/issues/125)) ([1f0cc1c](https://github.com/Increase/increase-kotlin/commit/1f0cc1c8b9313eeaba5fa22b505735577b986dd5))
* **client:** allow binary returns ([#135](https://github.com/Increase/increase-kotlin/issues/135)) ([d3beb70](https://github.com/Increase/increase-kotlin/commit/d3beb70a02d15cf5c4add53fbc5937b563e223c4))
* **client:** retry on 408 Request Timeout ([#92](https://github.com/Increase/increase-kotlin/issues/92)) ([3240021](https://github.com/Increase/increase-kotlin/commit/3240021d09b4414f7a3657c61d8ea080f5495c38))
* **core:** add `asUnknown` to `JsonField` ([69377cb](https://github.com/Increase/increase-kotlin/commit/69377cb2d9b3c44348b2b8871ef1e39b1648f231))
* default timeout is set for java clients ([#63](https://github.com/Increase/increase-kotlin/issues/63)) ([3a68122](https://github.com/Increase/increase-kotlin/commit/3a6812252b5598115168437e65e0b278ad41eb0d))
* **docs:** updates ([f02d8f2](https://github.com/Increase/increase-kotlin/commit/f02d8f256eafaf2a5d121effe53da2e54682d14e))
* generate addXxx methods for array types ([#66](https://github.com/Increase/increase-kotlin/issues/66)) ([79d0d81](https://github.com/Increase/increase-kotlin/commit/79d0d81790f1ee5da5360fb4b6d49e2fc7981600))
* **github:** include a devcontainer setup ([#132](https://github.com/Increase/increase-kotlin/issues/132)) ([d8b5ec0](https://github.com/Increase/increase-kotlin/commit/d8b5ec0d298b43218fb7ca3c7ea2752fa6b0b3bc))
* improve pagination response types ([94cc040](https://github.com/Increase/increase-kotlin/commit/94cc04066a59c30a20278ca6f425f533587d6afe))
* **internal:** improve client options ([e9e7800](https://github.com/Increase/increase-kotlin/commit/e9e780030d4ef7e56ac4de0daab0c34a214175ad))
* **internal:** improve client options ([e9e7800](https://github.com/Increase/increase-kotlin/commit/e9e780030d4ef7e56ac4de0daab0c34a214175ad))
* send Idempotency-Key by default for POST requests ([558ac22](https://github.com/Increase/increase-kotlin/commit/558ac22cd4bfd41e031a3c69ac48dcfab6b88f95))
* send Idempotency-Key by default for POST requests ([558ac22](https://github.com/Increase/increase-kotlin/commit/558ac22cd4bfd41e031a3c69ac48dcfab6b88f95))
* **tests:** support specifying `SKIP_MOCK_TESTS=true` ([aecbb88](https://github.com/Increase/increase-kotlin/commit/aecbb88e7abcca85cf9bd35786bc1b70e367f325))
* **test:** unskip file uploads tests ([#49](https://github.com/Increase/increase-kotlin/issues/49)) ([c805758](https://github.com/Increase/increase-kotlin/commit/c805758372ff1e0350405f62ae5f106e09ac7c83))
* use latest Java LTS to build SDK ([5d6c656](https://github.com/Increase/increase-kotlin/commit/5d6c6568ec0afc6f5c45c9c19e0c49a7adc62738))
* use latest Java LTS to build SDK ([5d6c656](https://github.com/Increase/increase-kotlin/commit/5d6c6568ec0afc6f5c45c9c19e0c49a7adc62738))


### Bug Fixes

* **api:** move ACH Return endpoint and add digital wallet properties ([#81](https://github.com/Increase/increase-kotlin/issues/81)) ([300fcd7](https://github.com/Increase/increase-kotlin/commit/300fcd79a47115573ce6b2c47e28028f161d9aab))
* auto-close responses even if an exception is thrown during deserialization ([#41](https://github.com/Increase/increase-kotlin/issues/41)) ([9e17d1a](https://github.com/Increase/increase-kotlin/commit/9e17d1aa1d97fa86b4f1afb2fcd941b6a7ecceae))
* **ci:** ignore stainless-app edits to release PR title ([#167](https://github.com/Increase/increase-kotlin/issues/167)) ([e0a8fc5](https://github.com/Increase/increase-kotlin/commit/e0a8fc53141a3564d86c92a0c00f1d58e137411c))
* **docs:** wrong client import in readme usage example ([#180](https://github.com/Increase/increase-kotlin/issues/180)) ([a00b344](https://github.com/Increase/increase-kotlin/commit/a00b34403f23abef8f1d57062ce28ae2a2445766))
* **metadata:** correct scm URL ([#11](https://github.com/Increase/increase-kotlin/issues/11)) ([ca56eec](https://github.com/Increase/increase-kotlin/commit/ca56eec435984535401181165860314b453bed14))
* remove unnecessary annotations ([ea2dd7b](https://github.com/Increase/increase-kotlin/commit/ea2dd7b8e24a32daf3259815d1c2abfada5f7825))
* rename At3dsCapableMerchant and FormSs4 with correct casing ([6a16c13](https://github.com/Increase/increase-kotlin/commit/6a16c133e468d651cfc8e8ef51951a6ff2308506))
* set correct timeouts on okhttp client ([#67](https://github.com/Increase/increase-kotlin/issues/67)) ([afef21d](https://github.com/Increase/increase-kotlin/commit/afef21d8f62b285548ac3a5a3edc60135b12d904))


### Code Refactoring

* **api:** remove many enum members from document category ([#25](https://github.com/Increase/increase-kotlin/issues/25)) ([53f7582](https://github.com/Increase/increase-kotlin/commit/53f7582d6e7a6478722e4cdaaf3c5a39066deb3f))
* **api:** rename return reason enum member ([#19](https://github.com/Increase/increase-kotlin/issues/19)) ([77624f7](https://github.com/Increase/increase-kotlin/commit/77624f7c9d381fb9ee2976b89334b3e955f45f30))
* fix oauth casing ([#168](https://github.com/Increase/increase-kotlin/issues/168)) ([c65357e](https://github.com/Increase/increase-kotlin/commit/c65357e70e3a73059f5360672e699a19e65fe725))
* rename nested params classes to use singular instead of plural ([85aefe1](https://github.com/Increase/increase-kotlin/commit/85aefe1a2f2a79f5f934d0ef4d90af31cda184ff))

## 0.28.0 (2024-02-15)

Full Changelog: [v0.27.1...v0.28.0](https://github.com/Increase/increase-kotlin/compare/v0.27.1...v0.28.0)

### ⚠ BREAKING CHANGES

* **api:** split card profile resource into digital and physical card profile resources ([#183](https://github.com/Increase/increase-kotlin/issues/183))

### Features

* **api:** split card profile resource into digital and physical card profile resources ([#183](https://github.com/Increase/increase-kotlin/issues/183)) ([aab1b0e](https://github.com/Increase/increase-kotlin/commit/aab1b0eb313745119fe92db3a78978135c1b7dff))


### Chores

* **ci:** uses Stainless GitHub App for releases ([#181](https://github.com/Increase/increase-kotlin/issues/181)) ([28b1670](https://github.com/Increase/increase-kotlin/commit/28b1670f48a52564866e566401a526f09bda1efa))

## 0.27.1 (2024-02-13)

Full Changelog: [v0.27.0...v0.27.1](https://github.com/Increase/increase-kotlin/compare/v0.27.0...v0.27.1)

### Bug Fixes

* **docs:** wrong client import in readme usage example ([#180](https://github.com/Increase/increase-kotlin/issues/180)) ([37f1a62](https://github.com/Increase/increase-kotlin/commit/37f1a626bfdb8affcc1312cfa57b1c5c38e16355))


### Chores

* **interal:** make link to api.md relative ([#179](https://github.com/Increase/increase-kotlin/issues/179)) ([c53ff0f](https://github.com/Increase/increase-kotlin/commit/c53ff0f771046fda9f514e5c177884722844f557))
* **internal:** support pre-release versioning ([#177](https://github.com/Increase/increase-kotlin/issues/177)) ([a235da3](https://github.com/Increase/increase-kotlin/commit/a235da3a9b64740b358eb9b60da214c603666a15))

## 0.27.0 (2024-01-26)

Full Changelog: [v0.26.0...v0.27.0](https://github.com/increase/increase-kotlin/compare/v0.26.0...v0.27.0)

### Features

* **api:** update descriptions ([#175](https://github.com/increase/increase-kotlin/issues/175)) ([c561869](https://github.com/increase/increase-kotlin/commit/c561869ff88431c306de83f8c9dc60af07480f8d))

## 0.26.0 (2024-01-24)

Full Changelog: [v0.25.0...v0.26.0](https://github.com/increase/increase-kotlin/compare/v0.25.0...v0.26.0)

### Features

* **api:** list Inbound Wire Transfers, change transfer simulation return types ([#173](https://github.com/increase/increase-kotlin/issues/173)) ([29ca2b3](https://github.com/increase/increase-kotlin/commit/29ca2b37b5c9d57e564992a264d6a5bb7640b1f4))

## 0.25.0 (2024-01-22)

Full Changelog: [v0.24.0...v0.25.0](https://github.com/increase/increase-kotlin/compare/v0.24.0...v0.25.0)

### Features

* **api:** simplify WireDecline and InboundWireTransfer ([#171](https://github.com/increase/increase-kotlin/issues/171)) ([a7ab754](https://github.com/increase/increase-kotlin/commit/a7ab754ff0b7c7d82fcd43ab4bab5e396cb05e18))

## 0.24.0 (2024-01-19)

Full Changelog: [v0.23.1...v0.24.0](https://github.com/increase/increase-kotlin/compare/v0.23.1...v0.24.0)

### ⚠ BREAKING CHANGES

* fix oauth casing ([#168](https://github.com/increase/increase-kotlin/issues/168))

### Features

* **api:** add oauth token and inbound wire transfer methods ([#170](https://github.com/increase/increase-kotlin/issues/170)) ([67ddbf5](https://github.com/increase/increase-kotlin/commit/67ddbf52fcf12597f61785ca106027529858ed51))


### Refactors

* fix oauth casing ([#168](https://github.com/increase/increase-kotlin/issues/168)) ([34466f2](https://github.com/increase/increase-kotlin/commit/34466f2d2ce0a2b359a27846603431345f3c7459))

## 0.23.1 (2024-01-18)

Full Changelog: [v0.23.0...v0.23.1](https://github.com/increase/increase-kotlin/compare/v0.23.0...v0.23.1)

### Bug Fixes

* **ci:** ignore stainless-app edits to release PR title ([#167](https://github.com/increase/increase-kotlin/issues/167)) ([386c3bb](https://github.com/increase/increase-kotlin/commit/386c3bbfde9699f1a69db1c3315894ccbb56bed6))


### Chores

* **internal:** speculative retry-after-ms support ([#166](https://github.com/increase/increase-kotlin/issues/166)) ([bf4502f](https://github.com/increase/increase-kotlin/commit/bf4502ff46cab1366d3fb1ad913614fd00393bba))
* remove Alex Rattray from reviewers ([#165](https://github.com/increase/increase-kotlin/issues/165)) ([6943c69](https://github.com/increase/increase-kotlin/commit/6943c69f203ef528d86e32d1c04cd7e1b707bdf5))


### Documentation

* **api:** fix typo ([#163](https://github.com/increase/increase-kotlin/issues/163)) ([57f0e39](https://github.com/increase/increase-kotlin/commit/57f0e39d78ee0c4c14f3451b6bd2fca3309cadbc))

## 0.23.0 (2024-01-12)

Full Changelog: [v0.22.0...v0.23.0](https://github.com/increase/increase-kotlin/compare/v0.22.0...v0.23.0)

### Features

* **api:** add merchant data to simulation api ([#162](https://github.com/increase/increase-kotlin/issues/162)) ([0efcae7](https://github.com/increase/increase-kotlin/commit/0efcae750c3148b3f85b22e5f1fe88c8fcc9b2d4))


### Documentation

* **readme:** improve api reference ([#160](https://github.com/increase/increase-kotlin/issues/160)) ([2fcb06e](https://github.com/increase/increase-kotlin/commit/2fcb06e57358d82de5f7c1127d3cf7294a59c522))

## 0.22.0 (2024-01-12)

Full Changelog: [v0.21.0...v0.22.0](https://github.com/increase/increase-kotlin/compare/v0.21.0...v0.22.0)

### Features

* **api:** allow webhook unwrapping without providing secret ([#158](https://github.com/increase/increase-kotlin/issues/158)) ([f86b768](https://github.com/increase/increase-kotlin/commit/f86b7687363884b25008d0b8895303f2d231cc82))

## 0.21.0 (2024-01-10)

Full Changelog: [v0.20.0...v0.21.0](https://github.com/increase/increase-kotlin/compare/v0.20.0...v0.21.0)

### Features

* **api:** new methods for handling webhooks ([#157](https://github.com/increase/increase-kotlin/issues/157)) ([b1074e4](https://github.com/increase/increase-kotlin/commit/b1074e4aa83a47a786b736fc989d05b50e1c6fed))


### Chores

* add .keep files for examples and custom code directories ([#154](https://github.com/increase/increase-kotlin/issues/154)) ([df4eb2a](https://github.com/increase/increase-kotlin/commit/df4eb2a7217b822a2292c3aed27c4ec4ccef59f2))
* **internal:** minor improvements to auth code ([#156](https://github.com/increase/increase-kotlin/issues/156)) ([89fa6b7](https://github.com/increase/increase-kotlin/commit/89fa6b7a4ec8fac184d2afa9c0c950fea52471d8))

## 0.20.0 (2024-01-08)

Full Changelog: [v0.19.0...v0.20.0](https://github.com/increase/increase-kotlin/compare/v0.19.0...v0.20.0)

### Features

* **api:** add `ach_debit_status` ([#152](https://github.com/increase/increase-kotlin/issues/152)) ([deb9632](https://github.com/increase/increase-kotlin/commit/deb9632c957fef724c3a7d1134d821ff4db102da))

## 0.19.0 (2024-01-02)

Full Changelog: [v0.18.0...v0.19.0](https://github.com/increase/increase-kotlin/compare/v0.18.0...v0.19.0)

### Features

* **api:** add real-time payments request for payment endpoints ([#151](https://github.com/increase/increase-kotlin/issues/151)) ([10596c4](https://github.com/increase/increase-kotlin/commit/10596c46df7c0f6e2ee79ecd234380f7e94b27e7))


### Chores

* **internal:** bump license ([#149](https://github.com/increase/increase-kotlin/issues/149)) ([dabd305](https://github.com/increase/increase-kotlin/commit/dabd305cf3f599598e30827104343038d5373ce7))

## 0.18.0 (2023-12-18)

Full Changelog: [v0.17.0...v0.18.0](https://github.com/increase/increase-kotlin/compare/v0.17.0...v0.18.0)

### Features

* **api:** add deposit_submission property to check deposit ([#148](https://github.com/increase/increase-kotlin/issues/148)) ([1f9c0da](https://github.com/increase/increase-kotlin/commit/1f9c0da3a92c5c769b9dce9ab016484c23e59f07))


### Chores

* **ci:** run release workflow once per day ([#146](https://github.com/increase/increase-kotlin/issues/146)) ([68e90e0](https://github.com/increase/increase-kotlin/commit/68e90e088b75dc7ecccc6a8504da4ae431acbc5c))

## 0.17.0 (2023-12-14)

Full Changelog: [v0.16.0...v0.17.0](https://github.com/increase/increase-kotlin/compare/v0.16.0...v0.17.0)

### Features

* **api:** add `suspected_fraud` rejection reason ([#144](https://github.com/increase/increase-kotlin/issues/144)) ([dfc60e5](https://github.com/increase/increase-kotlin/commit/dfc60e57bf32e776008addbe76cbe30c6279955f))

## 0.16.0 (2023-12-08)

Full Changelog: [v0.15.1...v0.16.0](https://github.com/increase/increase-kotlin/compare/v0.15.1...v0.16.0)

### Features

* **api:** updates ([#143](https://github.com/increase/increase-kotlin/issues/143)) ([d1c0a29](https://github.com/increase/increase-kotlin/commit/d1c0a29114d9a64e9d16af9a0d0073bb5728f464))

## 0.15.1 (2023-12-04)

Full Changelog: [v0.15.0...v0.15.1](https://github.com/increase/increase-kotlin/compare/v0.15.0...v0.15.1)

## 0.15.0 (2023-11-08)

Full Changelog: [v0.14.0...v0.15.0](https://github.com/increase/increase-kotlin/compare/v0.14.0...v0.15.0)

### Features

* **api:** restructure balance lookups ([#138](https://github.com/increase/increase-kotlin/issues/138)) ([73a3af6](https://github.com/increase/increase-kotlin/commit/73a3af6d8b6f10d1a3f83d5252d7a999c0ed0a4d))
* **client:** allow binary returns ([#135](https://github.com/increase/increase-kotlin/issues/135)) ([543c00e](https://github.com/increase/increase-kotlin/commit/543c00eff7759b28e8e21647cf069d9b62c9781a))


### Chores

* remove bad tests ([#137](https://github.com/increase/increase-kotlin/issues/137)) ([0a17bd3](https://github.com/increase/increase-kotlin/commit/0a17bd3f8a2a5e9d595a045933cf12317a4727e1))

## 0.14.0 (2023-11-01)

Full Changelog: [v0.13.0...v0.14.0](https://github.com/increase/increase-kotlin/compare/v0.13.0...v0.14.0)

### Features

* **api:** add failed to export status enum ([#134](https://github.com/increase/increase-kotlin/issues/134)) ([2cd100a](https://github.com/increase/increase-kotlin/commit/2cd100aab6ee8f0e67ed34a229f77f76aad1971d))
* **github:** include a devcontainer setup ([#132](https://github.com/increase/increase-kotlin/issues/132)) ([e6f911e](https://github.com/increase/increase-kotlin/commit/e6f911e161f8e15237f6727a95f28ea45b86791a))

## 0.13.0 (2023-10-27)

Full Changelog: [v0.12.0...v0.13.0](https://github.com/increase/increase-kotlin/compare/v0.12.0...v0.13.0)

### Features

* **api:** add network identifiers and effective date ([#130](https://github.com/increase/increase-kotlin/issues/130)) ([6cecffb](https://github.com/increase/increase-kotlin/commit/6cecffbd7a62bd7b4e2117c4e290162fe7986e7b))

## 0.12.0 (2023-10-26)

Full Changelog: [v0.11.0...v0.12.0](https://github.com/increase/increase-kotlin/compare/v0.11.0...v0.12.0)

### Features

* **api:** updates ([#128](https://github.com/increase/increase-kotlin/issues/128)) ([44d7533](https://github.com/increase/increase-kotlin/commit/44d75330c47bd8df180e29a7540ec6c5c2817620))

## 0.11.0 (2023-10-24)

Full Changelog: [v0.10.0...v0.11.0](https://github.com/increase/increase-kotlin/compare/v0.10.0...v0.11.0)

### Features

* **api:** add fuel confirmation functionality ([#124](https://github.com/increase/increase-kotlin/issues/124)) ([35d3a3b](https://github.com/increase/increase-kotlin/commit/35d3a3b2ed905795bd56cd367eb39dd0e980f6ac))
* **api:** add returned_per_odfi_request enum ([#123](https://github.com/increase/increase-kotlin/issues/123)) ([5b3a1a1](https://github.com/increase/increase-kotlin/commit/5b3a1a12253231c3554f2e248a13492361445519))
* **api:** updates ([#121](https://github.com/increase/increase-kotlin/issues/121)) ([3fa6d84](https://github.com/increase/increase-kotlin/commit/3fa6d841267ff44ce6e1d35c8d5ce68c69d40f10))
* **api:** updates ([#122](https://github.com/increase/increase-kotlin/issues/122)) ([37cedb7](https://github.com/increase/increase-kotlin/commit/37cedb77f6c3ad1cb90e2c604610fbcfa77e688c))
* **client:** adjust retry behavior ([#125](https://github.com/increase/increase-kotlin/issues/125)) ([e809e51](https://github.com/increase/increase-kotlin/commit/e809e51088b7940c6fb5a34e60fe290b0c5e14c0))

## 0.10.0 (2023-10-19)

Full Changelog: [v0.9.6...v0.10.0](https://github.com/increase/increase-kotlin/compare/v0.9.6...v0.10.0)

### Features

* **api:** add addenda details for ACH transfers ([#117](https://github.com/increase/increase-kotlin/issues/117)) ([4a5ef35](https://github.com/increase/increase-kotlin/commit/4a5ef3508591d484ba95abc2cd081fec3129b841))
* **api:** updates ([#118](https://github.com/increase/increase-kotlin/issues/118)) ([3f7ac5a](https://github.com/increase/increase-kotlin/commit/3f7ac5a744e9f66b0b676e8879d8e37d218b7ce7))


### Chores

* add case insensitive get header function ([#115](https://github.com/increase/increase-kotlin/issues/115)) ([6a72f5c](https://github.com/increase/increase-kotlin/commit/6a72f5c192f2905024f96b46f842f1a00acf548d))
* **internal:** minor reformatting ([#113](https://github.com/increase/increase-kotlin/issues/113)) ([5990110](https://github.com/increase/increase-kotlin/commit/59901103402b6ff1a1efc9dfd0bf2941bd7016e0))
* **internal:** rearrange client arguments ([#112](https://github.com/increase/increase-kotlin/issues/112)) ([e0775a4](https://github.com/increase/increase-kotlin/commit/e0775a41505fcbf3835c0d52b242ecf6a36c137e))
* update README ([#110](https://github.com/increase/increase-kotlin/issues/110)) ([4184ebf](https://github.com/increase/increase-kotlin/commit/4184ebf0061e0f959bd8ec5734052c8435ac5791))


### Documentation

* organisation -&gt; organization (UK to US English) ([#116](https://github.com/increase/increase-kotlin/issues/116)) ([a3eccf4](https://github.com/increase/increase-kotlin/commit/a3eccf4c736be666450d7c8136daa125ac4e212f))

## 0.9.6 (2023-10-05)

Full Changelog: [v0.9.5...v0.9.6](https://github.com/increase/increase-kotlin/compare/v0.9.5...v0.9.6)

### Features

* **api:** add direction property to CardAuthorization ([#108](https://github.com/increase/increase-kotlin/issues/108)) ([1994b5c](https://github.com/increase/increase-kotlin/commit/1994b5c0d65b44f0689050235a021668071a7cde))

## 0.9.5 (2023-10-04)

Full Changelog: [v0.9.4...v0.9.5](https://github.com/increase/increase-kotlin/compare/v0.9.4...v0.9.5)

### Features

* **api:** expand event categories and Entity status options ([#106](https://github.com/increase/increase-kotlin/issues/106)) ([634ba9d](https://github.com/increase/increase-kotlin/commit/634ba9d2d3e5d7e551a6e15418832dc63f70920e))


### Chores

* **internal:** add a top-level generated comment to each file ([#107](https://github.com/increase/increase-kotlin/issues/107)) ([370211c](https://github.com/increase/increase-kotlin/commit/370211c91d94d2439e86ec7a052f779b98162f2b))

## 0.9.4 (2023-09-29)

Full Changelog: [v0.9.3...v0.9.4](https://github.com/Increase/increase-kotlin/compare/v0.9.3...v0.9.4)

### Features

* **api:** add card payments endpoints ([#102](https://github.com/Increase/increase-kotlin/issues/102)) ([fd6be05](https://github.com/Increase/increase-kotlin/commit/fd6be05cfda7ed049af6d472b52cd1f96ddd4b04))
* **api:** add physical cards endpoints ([#100](https://github.com/Increase/increase-kotlin/issues/100)) ([e6a53a8](https://github.com/Increase/increase-kotlin/commit/e6a53a8d9e4e8faacf88589e6d12c94596e75810))

## 0.9.3 (2023-09-22)

Full Changelog: [v0.9.2...v0.9.3](https://github.com/increase/increase-kotlin/compare/v0.9.2...v0.9.3)

### Features

* **api:** add inbound checks, originating routing number and new event types ([#98](https://github.com/increase/increase-kotlin/issues/98)) ([f23f447](https://github.com/increase/increase-kotlin/commit/f23f447676695c9a6810b22d80a83ad184e6ebb4))

## 0.9.2 (2023-09-20)

Full Changelog: [v0.9.1...v0.9.2](https://github.com/Increase/increase-kotlin/compare/v0.9.1...v0.9.2)

### Features

* **api:** add entity_id to Card and make relationship nullable ([#95](https://github.com/Increase/increase-kotlin/issues/95)) ([9fb6c66](https://github.com/Increase/increase-kotlin/commit/9fb6c6696e365392bae4fbeb91e321228a98ddf6))
* **api:** export account statements in OFX format ([#97](https://github.com/Increase/increase-kotlin/issues/97)) ([e2a6b0d](https://github.com/Increase/increase-kotlin/commit/e2a6b0d9dacc322040d25bf0facab15258b80072))

## 0.9.1 (2023-09-15)

Full Changelog: [v0.9.0...v0.9.1](https://github.com/increase/increase-kotlin/compare/v0.9.0...v0.9.1)

### Features

* **api:** add card payment ID reference to transaction models ([#90](https://github.com/increase/increase-kotlin/issues/90)) ([ec6769a](https://github.com/increase/increase-kotlin/commit/ec6769a5d9a913cddec1974b0928d3f4ffbf241a))
* **client:** retry on 408 Request Timeout ([#92](https://github.com/increase/increase-kotlin/issues/92)) ([29868c2](https://github.com/increase/increase-kotlin/commit/29868c2da1c2b9d571b8882c31985e5dd37a1e02))

## 0.9.0 (2023-09-12)

Full Changelog: [v0.8.3...v0.9.0](https://github.com/increase/increase-kotlin/compare/v0.8.3...v0.9.0)

### ⚠ BREAKING CHANGES

* **api:** remove Limits API, add ACH controls to Account Numbers   ([#88](https://github.com/increase/increase-kotlin/issues/88))

### Features

* **api:** remove Limits API, add ACH controls to Account Numbers   ([#88](https://github.com/increase/increase-kotlin/issues/88)) ([81ca511](https://github.com/increase/increase-kotlin/commit/81ca5111e6ba2d433a258ee4008542df2fc71fd3))

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
