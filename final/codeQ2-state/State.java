public interface State {
    void handleTransition(Context context, String action);
}