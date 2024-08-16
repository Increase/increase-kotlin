// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.Enum
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.BinaryResponseContent
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.multipartFormData
import com.increase.api.services.stringHandler
import com.increase.api.services.binaryHandler
import com.increase.api.services.withErrorHandler
import com.increase.api.services.async.simulations.AccountTransferServiceAsync
import com.increase.api.services.async.simulations.AccountTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundAchTransferServiceAsync
import com.increase.api.services.async.simulations.InboundAchTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.AchTransferServiceAsync
import com.increase.api.services.async.simulations.AchTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.CheckTransferServiceAsync
import com.increase.api.services.async.simulations.CheckTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundCheckDepositServiceAsync
import com.increase.api.services.async.simulations.InboundCheckDepositServiceAsyncImpl
import com.increase.api.services.async.simulations.CheckDepositServiceAsync
import com.increase.api.services.async.simulations.CheckDepositServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundWireTransferServiceAsync
import com.increase.api.services.async.simulations.InboundWireTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.WireTransferServiceAsync
import com.increase.api.services.async.simulations.WireTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundWireDrawdownRequestServiceAsync
import com.increase.api.services.async.simulations.InboundWireDrawdownRequestServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundRealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.simulations.InboundRealTimePaymentsTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundFundsHoldServiceAsync
import com.increase.api.services.async.simulations.InboundFundsHoldServiceAsyncImpl
import com.increase.api.services.async.simulations.RealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.simulations.RealTimePaymentsTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.CardAuthorizationServiceAsync
import com.increase.api.services.async.simulations.CardAuthorizationServiceAsyncImpl
import com.increase.api.services.async.simulations.CardSettlementServiceAsync
import com.increase.api.services.async.simulations.CardSettlementServiceAsyncImpl
import com.increase.api.services.async.simulations.CardReversalServiceAsync
import com.increase.api.services.async.simulations.CardReversalServiceAsyncImpl
import com.increase.api.services.async.simulations.CardIncrementServiceAsync
import com.increase.api.services.async.simulations.CardIncrementServiceAsyncImpl
import com.increase.api.services.async.simulations.CardAuthorizationExpirationServiceAsync
import com.increase.api.services.async.simulations.CardAuthorizationExpirationServiceAsyncImpl
import com.increase.api.services.async.simulations.CardFuelConfirmationServiceAsync
import com.increase.api.services.async.simulations.CardFuelConfirmationServiceAsyncImpl
import com.increase.api.services.async.simulations.CardRefundServiceAsync
import com.increase.api.services.async.simulations.CardRefundServiceAsyncImpl
import com.increase.api.services.async.simulations.CardDisputeServiceAsync
import com.increase.api.services.async.simulations.CardDisputeServiceAsyncImpl
import com.increase.api.services.async.simulations.DigitalWalletTokenRequestServiceAsync
import com.increase.api.services.async.simulations.DigitalWalletTokenRequestServiceAsyncImpl
import com.increase.api.services.async.simulations.PhysicalCardServiceAsync
import com.increase.api.services.async.simulations.PhysicalCardServiceAsyncImpl
import com.increase.api.services.async.simulations.InterestPaymentServiceAsync
import com.increase.api.services.async.simulations.InterestPaymentServiceAsyncImpl
import com.increase.api.services.async.simulations.AccountStatementServiceAsync
import com.increase.api.services.async.simulations.AccountStatementServiceAsyncImpl
import com.increase.api.services.async.simulations.DocumentServiceAsync
import com.increase.api.services.async.simulations.DocumentServiceAsyncImpl
import com.increase.api.services.async.simulations.ProgramServiceAsync
import com.increase.api.services.async.simulations.ProgramServiceAsyncImpl

class SimulationServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : SimulationServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val accountTransfers: AccountTransferServiceAsync by lazy { AccountTransferServiceAsyncImpl(clientOptions) }

    private val inboundAchTransfers: InboundAchTransferServiceAsync by lazy { InboundAchTransferServiceAsyncImpl(clientOptions) }

    private val achTransfers: AchTransferServiceAsync by lazy { AchTransferServiceAsyncImpl(clientOptions) }

    private val checkTransfers: CheckTransferServiceAsync by lazy { CheckTransferServiceAsyncImpl(clientOptions) }

    private val inboundCheckDeposits: InboundCheckDepositServiceAsync by lazy { InboundCheckDepositServiceAsyncImpl(clientOptions) }

    private val checkDeposits: CheckDepositServiceAsync by lazy { CheckDepositServiceAsyncImpl(clientOptions) }

    private val inboundWireTransfers: InboundWireTransferServiceAsync by lazy { InboundWireTransferServiceAsyncImpl(clientOptions) }

    private val wireTransfers: WireTransferServiceAsync by lazy { WireTransferServiceAsyncImpl(clientOptions) }

    private val inboundWireDrawdownRequests: InboundWireDrawdownRequestServiceAsync by lazy { InboundWireDrawdownRequestServiceAsyncImpl(clientOptions) }

    private val inboundRealTimePaymentsTransfers: InboundRealTimePaymentsTransferServiceAsync by lazy { InboundRealTimePaymentsTransferServiceAsyncImpl(clientOptions) }

    private val inboundFundsHolds: InboundFundsHoldServiceAsync by lazy { InboundFundsHoldServiceAsyncImpl(clientOptions) }

    private val realTimePaymentsTransfers: RealTimePaymentsTransferServiceAsync by lazy { RealTimePaymentsTransferServiceAsyncImpl(clientOptions) }

    private val cardAuthorizations: CardAuthorizationServiceAsync by lazy { CardAuthorizationServiceAsyncImpl(clientOptions) }

    private val cardSettlements: CardSettlementServiceAsync by lazy { CardSettlementServiceAsyncImpl(clientOptions) }

    private val cardReversals: CardReversalServiceAsync by lazy { CardReversalServiceAsyncImpl(clientOptions) }

    private val cardIncrements: CardIncrementServiceAsync by lazy { CardIncrementServiceAsyncImpl(clientOptions) }

    private val cardAuthorizationExpirations: CardAuthorizationExpirationServiceAsync by lazy { CardAuthorizationExpirationServiceAsyncImpl(clientOptions) }

    private val cardFuelConfirmations: CardFuelConfirmationServiceAsync by lazy { CardFuelConfirmationServiceAsyncImpl(clientOptions) }

    private val cardRefunds: CardRefundServiceAsync by lazy { CardRefundServiceAsyncImpl(clientOptions) }

    private val cardDisputes: CardDisputeServiceAsync by lazy { CardDisputeServiceAsyncImpl(clientOptions) }

    private val digitalWalletTokenRequests: DigitalWalletTokenRequestServiceAsync by lazy { DigitalWalletTokenRequestServiceAsyncImpl(clientOptions) }

    private val physicalCards: PhysicalCardServiceAsync by lazy { PhysicalCardServiceAsyncImpl(clientOptions) }

    private val interestPayments: InterestPaymentServiceAsync by lazy { InterestPaymentServiceAsyncImpl(clientOptions) }

    private val accountStatements: AccountStatementServiceAsync by lazy { AccountStatementServiceAsyncImpl(clientOptions) }

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    private val programs: ProgramServiceAsync by lazy { ProgramServiceAsyncImpl(clientOptions) }

    override fun accountTransfers(): AccountTransferServiceAsync = accountTransfers

    override fun inboundAchTransfers(): InboundAchTransferServiceAsync = inboundAchTransfers

    override fun achTransfers(): AchTransferServiceAsync = achTransfers

    override fun checkTransfers(): CheckTransferServiceAsync = checkTransfers

    override fun inboundCheckDeposits(): InboundCheckDepositServiceAsync = inboundCheckDeposits

    override fun checkDeposits(): CheckDepositServiceAsync = checkDeposits

    override fun inboundWireTransfers(): InboundWireTransferServiceAsync = inboundWireTransfers

    override fun wireTransfers(): WireTransferServiceAsync = wireTransfers

    override fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync = inboundWireDrawdownRequests

    override fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferServiceAsync = inboundRealTimePaymentsTransfers

    override fun inboundFundsHolds(): InboundFundsHoldServiceAsync = inboundFundsHolds

    override fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync = realTimePaymentsTransfers

    override fun cardAuthorizations(): CardAuthorizationServiceAsync = cardAuthorizations

    override fun cardSettlements(): CardSettlementServiceAsync = cardSettlements

    override fun cardReversals(): CardReversalServiceAsync = cardReversals

    override fun cardIncrements(): CardIncrementServiceAsync = cardIncrements

    override fun cardAuthorizationExpirations(): CardAuthorizationExpirationServiceAsync = cardAuthorizationExpirations

    override fun cardFuelConfirmations(): CardFuelConfirmationServiceAsync = cardFuelConfirmations

    override fun cardRefunds(): CardRefundServiceAsync = cardRefunds

    override fun cardDisputes(): CardDisputeServiceAsync = cardDisputes

    override fun digitalWalletTokenRequests(): DigitalWalletTokenRequestServiceAsync = digitalWalletTokenRequests

    override fun physicalCards(): PhysicalCardServiceAsync = physicalCards

    override fun interestPayments(): InterestPaymentServiceAsync = interestPayments

    override fun accountStatements(): AccountStatementServiceAsync = accountStatements

    override fun documents(): DocumentServiceAsync = documents

    override fun programs(): ProgramServiceAsync = programs
}
