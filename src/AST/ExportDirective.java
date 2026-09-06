package AST;

import java.util.List;

public class ExportDirective extends ASTNode {
    public String uri;
    public List<String> showList;
    public List<String> hideList;

    public ExportDirective(String uri, List<String> showList, List<String> hideList) {
        this.uri = uri;
        this.showList = showList;
        this.hideList = hideList;
    }

    @Override
    public String toString() {
        return "\nExportDirective{" +
                "uri='" + uri + '\'' +
                (showList != null && !showList.isEmpty() ? ", show=" + showList : "") +
                (hideList != null && !hideList.isEmpty() ? ", hide=" + hideList : "") +
                '}';
    }
}
