package core.basesyntax.report;

import core.basesyntax.db.Storage;
import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {
    private Storage storage;

    @Override
    public String getReport() {
        StringBuilder report = new StringBuilder();

        report.append("fruit,quantity").append("\n");
        for (Map.Entry<String, Integer> entry : storage.getFruits().entrySet()) {
            report.append(entry.getKey())
                    .append(",")
                    .append(entry.getValue())
                    .append("\n");
        }
        return report.toString();
    }
}
