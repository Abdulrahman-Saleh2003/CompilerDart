package Symbol;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    private List<Row> rows = new ArrayList<>();

    public SymbolTable() {
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public void addRow(String name, String type, String varType, Object value) {
        rows.add(new Row(name, type, varType, value));
    }

    public void print() {
        System.out.println("\n================================= SYMBOL TABLE =================================");
        System.out.printf("| %-20s | %-15s | %-15s | %-20s |\n", "Name", "Type", "Var Type", "Value");
        System.out.println("---------------------------------------------------------------------------------");
        for (Row row : rows) {
            String valStr = row.getValue() != null ? row.getValue().toString().replace("\n", " ").trim() : "null";
            if (valStr.length() > 20) {
                valStr = valStr.substring(0, 17) + "...";
            }
            System.out.printf("| %-20s | %-15s | %-15s | %-20s |\n",
                    row.getName() != null ? row.getName() : "anonymous",
                    row.getType() != null ? row.getType() : "void",
                    row.getVarType() != null ? row.getVarType() : "Variable",
                    valStr);
        }
        System.out.println("=================================================================================\n");
    }
}
