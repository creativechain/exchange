/*
 * This file is part of bisq.
 *
 * bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package io.bisq.core.trade.protocol.tasks.taker;

import io.bisq.common.taskrunner.TaskRunner;
import io.bisq.core.trade.Trade;
import io.bisq.core.trade.protocol.tasks.TradeTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerifyOfferFeePayment extends TradeTask {
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(VerifyOfferFeePayment.class);

    @SuppressWarnings({"WeakerAccess", "unused"})
    public VerifyOfferFeePayment(TaskRunner taskHandler, Trade trade) {
        super(taskHandler, trade);
    }

    @Override
    protected void run() {
        try {
            runInterceptHook();
            //TODO impl. missing
            // int numOfPeersSeenTx = processModel.getWalletService().getNumOfPeersSeenTx(processModel.getTakeOfferFeeTxId().getHashAsString());
       /* if (numOfPeersSeenTx > 2) {
            resultHandler.handleResult();
        }*/
            complete();
        } catch (Throwable t) {
            failed(t);
        }
    }
}
