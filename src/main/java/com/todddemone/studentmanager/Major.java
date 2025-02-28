package com.todddemone.studentmanager;

public enum Major {
    PHYSICS,
    BIOLOGY,
    CHEMISTRY,
    MATH,
    ENGLISH,
    SOCIOLOGY,
    ENGINEERING,
    COMPUTER_SCIENCE,
    HISTORY,
    PSYCHOLOGY;

    // Converts a string to an Enum, throwing an error if major is invalid
    public static Major fromString(String majorName) {
        for (Major major : Major.values()) {
            if (major.name().equalsIgnoreCase(majorName)) {
                return major;
            }
        }
        throw new IllegalArgumentException("Invalid major: " + majorName);
    }
}
