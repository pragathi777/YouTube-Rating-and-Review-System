package com.youtube.frontend;

import com.youtube.backend.Channel;
import com.youtube.backend.ChannelRepository;

import java.util.Scanner;


public class YouTubeConsoleUI {
    private static final ChannelRepository repository = new ChannelRepository();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== YouTube Channel Rating and Review System ===");
        runMenu();
        scanner.close();
        System.out.println("Exiting. Thank you!");
    }

  
    private static void runMenu() {
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. List and Rate/Review a Channel");
            System.out.println("2. Add a New Channel");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    reviewExistingChannel();
                    break;
                case 2:
                    addNewChannel();
                    break;
                case 3:
                    return; // Exit the loop and the method
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    
    private static void reviewExistingChannel() {
        System.out.println("\n--- Available Channels ---");
        for (Channel channel : repository.getAllChannels()) {
            System.out.println("- " + channel.getName());
        }

        System.out.print("\nEnter the channel name you want to review: ");
        String channelName = scanner.nextLine();

        Channel channel = repository.getChannelByName(channelName);
        if (channel == null) {
            System.out.println("Channel not found!");
            return;
        }

        System.out.println("Current details: " + channel);
        System.out.print("Enter your new review: ");
        String review = scanner.nextLine();
        channel.setReview(review);

        System.out.print("Enter your new rating (1-5): ");
        int rating = getRatingInput();
        channel.setRating(rating);

        System.out.println("Review and rating updated successfully!");
    }

   
    private static void addNewChannel() {
        System.out.println("\n--- Add a New Channel ---");
        System.out.print("Enter the new channel name: ");
        String name = scanner.nextLine();

        if (repository.getChannelByName(name) != null) {
            System.out.println("This channel already exists. Please choose option 1 to review it.");
            return;
        }

        System.out.print("Enter your review: ");
        String review = scanner.nextLine();

        System.out.print("Enter your rating (1-5): ");
        int rating = getRatingInput();

        System.out.print("Enter the channel URL (optional): ");
        String url = scanner.nextLine();

        Channel newChannel = new Channel(name, review, rating, url);
        repository.addChannel(newChannel);

        System.out.println("New channel '" + name + "' added successfully!");
    }

    
    private static int getRatingInput() {
        while (true) {
            try {
                int rating = Integer.parseInt(scanner.nextLine());
                if (rating >= 1 && rating <= 5) {
                    return rating;
                } else {
                    System.out.print("Invalid rating. Please enter a number between 1 and 5: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }
}


