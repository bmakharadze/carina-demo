package com.solvd.amazon.carina.web.components.filters;

public enum DepartmentsDeal {

    AMAZON_DEVICES("Amazon Devices"),

    ARTS_CRAFTS_SEWING("Arts, Crafts & Sewing"),

    AUTOMOTIVE_MOTORCYCLE("Automotive & Motorcycle"),

    BABY("Baby"),

    BABY_CLOTHING_ACCESSORIES("Baby Clothing & Accessories"),

    BEAUTY("Beauty"),

    BOOKS("Books"),

    BOYS_FASHION("Boys’ Fashion"),

    CAMERA_PHOTO("Camera & Photo"),

    CELL_PHONES_ACCESSORIES("Cell Phones & Accessories"),

    COMPUTERS_ACCESSORIES("Computers & Accessories"),

    COSTUMES_ACCESSORIES("Costumes & Accessories"),

    ELECTRONICS("Electronics"),

    EVERYTHING_ELSE("Everything Else"),

    FASHION("Fashion"),

    FURNITURE("Furniture"),

    GIFT_CARDS("Gift Cards"),

    GIRLS_FASHION("Girls’ Fashion"),

    GROCERY("Grocery"),

    HANDMADE("Handmade"),

    HEADPHONES("Headphones"),

    HEALTH_PERSONAL_CARE("Health & Personal Care"),

    HOME("Home"),

    HOME_AUDIO("Home Audio"),

    HOME_IMPROVEMENT("Home Improvement"),
    INDUSTRIAL_SCIENTIFIC("Industrial & Scientific"),

    KINDLE("Kindle"),

    KINDLE_EBOOKS("Kindle eBooks"),

    KITCHEN("Kitchen"),

    LUGGAGE_TRAVEL_GEAR("Luggage Travel Gear"),

    MAGAZINES("Magazines"),

    MAJOR_APPLIANCES("Major Appliances"),

    MENS_SHOES("Men\'s Shoes"),

    MENS_WATCHES("Men\'s Watches"),

    MENS_CLOTHING("Men’s Clothing"),

    MENS_FASHION("Men’s Fashion"),

    MOVIES_TV("Movies & TV"),

    MUSIC("Music"),

    MUSICAL_INSTRUMENTS("Musical Instruments"),

    OFFICE_ELECTRONICS_SUPPLIES("Office Electronics & Supplies"),

    PATIO_LAWN_GARDEN("Patio, Lawn & Garden"),

    PET_SUPPLIES("Pet Supplies"),

    PORTABLE_SPEAKERS("Portable Speakers"),

    POWER_HAND_TOOLS("Power & Hand Tools"),

    SOFTWARE("Software"),

    SPORTS_OUTDOORS("Sports & Outdoors"),

    TELEVISION_VIDEO("Television & Video"),

    TOYS_GAMES("Toys & Games"),

    VIDEO_GAMES("Video Games"),

    WOMENS_SHOES("Women's Shoes"),

    WOMENS_WATCHES("Women\'s Watches"),

    WOMENS_CLOTHING("Women’s Clothing"),

    WOMENS_FASHION("Women’s Fashion"),

    WOMENS_JEWELRY("Women’s Jewelry");

    private String department;

    DepartmentsDeal(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

}


