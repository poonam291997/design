class RefData {
    String path;
    Boolean hidden;
    RefData(path, hidden) {
    }
    static RefData rawData = new RefData("..", true);
    static RefData cleanedUpData = new RefData("..", true);
    static RefData processedData = new RefData("..", true);
    static RefData publication = new RefData("..", true);
}

path = RefData.rawData.path;
