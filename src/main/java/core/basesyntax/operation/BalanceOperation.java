package core.basesyntax.operation;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;

public class BalanceOperation implements OperationHandler {
    private Storage storage;

    @Override
    public void handle(FruitTransaction transaction) {
        storage.getFruits().put(transaction.getFruit(), transaction.getQuantity());
    }
}
