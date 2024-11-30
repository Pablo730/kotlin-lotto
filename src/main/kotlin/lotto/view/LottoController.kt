package lotto.view

import lotto.domain.*

object LottoController {
    fun lottoPurchased(): PurchasedLottoTickets {
        val purchasedLottoTickets =
            LottoTicketIssuer
                .issueTickets(amountPaid = PurchaseLottoView.view(), lottoNumberGenerator = { lottoNumberGenerator() })

        PurchaseLottoResultView.view(purchasedLottoTickets = purchasedLottoTickets)
        return purchasedLottoTickets
    }

    fun lottoWinnerNumber(): LottoWinnerNumbers {
        return LottoWinnerNumbers(inputWinnerNumbersCommand = WinnerLottoNumberView.view())
    }

    fun payoutResult(
        purchasedLottoResults: PurchasedLottoTickets,
        lottoWinnerNumbers: LottoWinnerNumbers,
    ) {
        return LottoPayoutView.view(
            LottoNumberChecker.purchasedLottoTicketsNumberCheck(
                purchasedLottoTickets = purchasedLottoResults,
                winnerNumbers = lottoWinnerNumbers,
            ),
        )
    }
}
