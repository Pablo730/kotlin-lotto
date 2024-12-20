package lotto.view

import lotto.domain.PurchasedLottoResults

object LottoPayoutView {
    fun displayWinningStatistics(purchasedLottoResults: PurchasedLottoResults) {
        println("\n당첨 통계")
        println("---------")
        println("3개 일치 (5000원) - ${purchasedLottoResults.fifthRankCount}개")
        println("4개 일치 (50000원) - ${purchasedLottoResults.fourthRankCount}개")
        println("5개 일치 (1500000원) - ${purchasedLottoResults.thirdRankCount}개")
        println("5개 일치, 보너스 볼 일치(30000000원) - ${purchasedLottoResults.secondRankCount}개")
        println("6개 일치 (2000000000원) - ${purchasedLottoResults.firstRankCount}개")
        print("총 수익률은 ${purchasedLottoResults.getProfitMargin()}입니다.")
        if (purchasedLottoResults.getProfitMargin() < 1.0) {
            println("(기준이 1이기 때문에 결과적으로 손해라는 의미임)")
        }
    }
}
