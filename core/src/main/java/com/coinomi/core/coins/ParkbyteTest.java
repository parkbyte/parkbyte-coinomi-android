package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;
import com.coinomi.core.coins.families.PeerFamily;

import org.bitcoinj.core.Coin;

/**
 * @author John L. Jegutanis
 */
public class ParkbyteTest extends CoinType {
    private ParkbyteTest() {
        id = "parkbyte.test";

        addressHeader = 111;
        p2shHeader = 196;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 50;

        family = PeerFamily.get();
        name = "Parkbyte Test";
        symbol = "PKBTEST";
        uriScheme = "parkbyte"; // TODO verify, could be ppcoin?
        bip44Index = 1;
        unitExponent = 6;
        feePerKb = value(100000); // 0.0001PKB
        minNonDust = value(100000); // 0.0001PKB
        softDustLimit = minNonDust;
        softDustPolicy = SoftDustPolicy.NO_POLICY;
    }

    private static ParkbyteTest instance = new ParkbyteTest();
    public static synchronized ParkbyteTest get() {
        return instance;
    }
}
