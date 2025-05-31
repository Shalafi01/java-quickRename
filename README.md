# Quick Rename
Quick Rename is a simple Java Swing application designed to help you efficiently rename multiple files within a selected directory. It offers various renaming options, including searching and replacing strings, adding prefixes or suffixes, truncating names, and applying sequential numbering.

## Features
* **Batch Renaming**: Rename multiple files in a chosen directory at once.
* **Search and Replace**: Find specific strings in file names and replace them with new ones.
* **Add Prefix/Suffix**: Easily add custom text to the beginning or end of file names.
* **Truncate Names**: Trim file names based on specified start and end character positions.
* **Sequential Numbering**: Apply sequential numbering to files, with options for padding (e.g., `001`, `002`).
* **Live Preview**: The application displays the current file names in a text area, allowing you to see the changes before applying them.
* **Directory Management**:
    * **Browse**: Select a directory to load its file names.
    * **Open Directory**: Open the currently selected directory in your system's file explorer.
* **User-Friendly Interface**: A simple tabbed interface built with Java Swing for different renaming operations.

## Usage
The application is divided into three main tabs: "Replace," "Add," and "Other."

### General Steps:
1.  **Select Directory**: On any tab, click the "**Browse...**" button to choose the folder containing the files you want to rename. The file names will appear in the text area.
2.  **Open Directory**: Click the "**Open**" button to quickly open the selected directory in your operating system's file explorer.
3.  **Apply Changes**: After configuring your renaming options, click the relevant "Apply" or "Add" or "Numbering" / "Truncate" button to perform the renaming.

### Tab: Replace
* **Search String**: Enter the text you want to find in the file names.
* **Replace String**: Enter the text that will replace the found string.
* Click "**Apply**" to apply the changes.
* **Info**: Provides important notes about using special characters in the search string.

### Tab: Add
* **Text to Add**: Enter the text you wish to add.
* Click "**Add to beginning**" to prepend the text to file names.
* Click "**Add to end**" to append the text to file names.
* **Info**: Explains assumptions made about file extensions when appending text.

### Tab: Other
* **Numbering**: Click "**Numbering**" to add sequential numbers to file names. You'll be prompted to enter a starting number. Numbers will be padded with leading zeros (e.g., `001`, `010`).
* **Add Numbering**: (Likely similar to the above, might be a duplicate or slightly different numbering option).
* **Truncate**:
    * Enter a **start index** in `startField`.
    * Enter an **end index** in `endField`. Use `L` for the end of the string.
    * Click "**Truncate**" to trim file names based on these indices.
