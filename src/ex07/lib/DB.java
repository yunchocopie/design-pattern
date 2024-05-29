package ex07.lib;

public interface DB {
    void setUrl(String url);
    int execute(String sql);
}
