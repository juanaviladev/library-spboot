package es.urjc.cloudapps.library.application.dtos;

public class CommentDto {

    private final String id;
    private final String authorName;
    private final String body;
    private final int rating;

    public CommentDto(String id, String authorName, String body, int rating) {
        this.id = id;
        this.authorName = authorName;
        this.body = body;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBody() {
        return body;
    }

    public int getRating() {
        return rating;
    }
}
