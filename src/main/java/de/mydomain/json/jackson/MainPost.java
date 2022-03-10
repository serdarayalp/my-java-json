package de.mydomain.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainPost {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // create a post
        Post post = new Post();
        post.setTitle("Jackson JSON API Guide");
        post.setId(100L);
        post.setDescription("Post about Jackson JSON API");
        post.setContent("HTML content here");
        post.setLastUpdatedAt(new Date());
        post.setPostedAt(new Date());

        Set<Tag> tags = new HashSet<>();
        Tag java = new Tag(1L, "Java");
        Tag jackson = new Tag(2L, "Jackson");
        Tag json = new Tag(3L, "JSON");
        tags.add(java);
        tags.add(jackson);
        tags.add(json);

        post.setTags(tags);

        String postJson = mapper.writeValueAsString(post);

        System.out.println(postJson);

        /*
        // Save JSON string to file
        FileOutputStream fileOutputStream = new FileOutputStream("post.json");
        mapper.writeValue(fileOutputStream, post);
        fileOutputStream.close();
        */


        /*
        // Read JSON file and convert to java object
        InputStream fileInputStream = new FileInputStream("post.json");
        Post post2 = mapper.readValue(fileInputStream, Post.class);
        fileInputStream.close();
        */

        Post post2 = mapper.readValue(postJson, Post.class);

        System.out.println("Printing post details");
        System.out.println(post2.getId());
        System.out.println(post2.getTitle());
        System.out.println(post2.getDescription());
        System.out.println(post2.getContent());
        System.out.println(post2.getLastUpdatedAt());
        System.out.println(post2.getPostedAt());

        // print tags of this post
        System.out.println("Printing tag details of post: " + post2.getTitle());
        for (Iterator<Tag> iterator = post2.getTags().iterator(); iterator.hasNext(); ) {
            Tag tag = (Tag) iterator.next();

            System.out.println(tag.getId());
            System.out.println(tag.getName());

        }

    }
}
