package AST;

import java.util.List;

public class ImportDirective extends ASTNode {
    public String uri;
    public String prefix;
    public List<String> showList;
    public List<String> hideList;

    public ImportDirective(String uri, String prefix, List<String> showList, List<String> hideList) {
        this.uri = uri;
        this.prefix = prefix;
        this.showList = showList;
        this.hideList = hideList;
    }

    @Override
    public String toString() {
        return "\nImportDirective{" +
                "uri='" + uri + '\'' +
                (prefix != null ? ", as='" + prefix + '\'' : "") +
                (showList != null && !showList.isEmpty() ? ", show=" + showList : "") +
                (hideList != null && !hideList.isEmpty() ? ", hide=" + hideList : "") +
                '}';
    }
}
