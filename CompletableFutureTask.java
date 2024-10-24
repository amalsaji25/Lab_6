package org.example.CompletableFutureSamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTask {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        String fileName = "sample_data.txt";  // Make sure this file is in the resources folder

        // 1. Read file asynchronously
        // TODO:

        // 2. Transform content to uppercase
        // TODO:

        // 3. Count words in the file content
        // TODO:

        // 4. Combine results of transformations
        // TODO:

        // 5. Handle errors during file read or processing
        // TODO:

        executor.shutdown();
    }

    // Read file content from resources
    private static String readFileFromResources(String fileName) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                Objects.requireNonNull(CompletableFutureTask.class.getClassLoader().getResourceAsStream(fileName)),
                StandardCharsets.UTF_8))) {

            System.out.println("Reading file: " + fileName);
            return reader.lines().collect(Collectors.joining("\n"));

        } catch (IOException e) {
            throw new RuntimeException("Failed to read file: " + e.getMessage());
        } catch (NullPointerException e) {
            throw new RuntimeException("File not found: " + fileName);
        }
    }
}

