# Quick Rename
Quick Rename is a simple Java Swing application designed to help you efficiently rename multiple files within a selected directory. It offers various renaming options, including searching and replacing strings, adding prefixes or suffixes, truncating names, and applying sequential numbering.


## # Features
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

## # Usage

The application is divided into three main tabs: "Sostituire" (Replace), "Aggiungere" (Add), and "Altro" (Other).

### ## General Steps:

1.  **Select Directory**: On any tab, click the "**Sfoglia...**" (Browse...) button to choose the folder containing the files you want to rename. The file names will appear in the text area.
2.  **Open Directory**: Click the "**Apri**" (Open) button to quickly open the selected directory in your operating system's file explorer.
3.  **Apply Changes**: After configuring your renaming options, click the relevant "Applica" or "Aggiungere" or "Numerazione" / "Tronca" button to perform the renaming.

### ## Tab: Sostituire (Replace)

* **Stringa da ricercare**: Enter the text you want to find in the file names.
* **Stringa da sostituire**: Enter the text that will replace the found string.
* Click "**Applica**" to apply the changes.
* **Info**: Provides important notes about using special characters in the search string.

### ## Tab: Aggiungere (Add)

* **Stringa da aggiungere**: Enter the text you wish to add.
* Click "**Aggiungere all'inizio**" (Add to beginning) to prepend the text to file names.
* Click "**Aggiungere alla fine**" (Add to end) to append the text to file names.
* **Info**: Explains assumptions made about file extensions when appending text.

### ## Tab: Altro (Other)

* **Numerazione**: Click "**Numerazione**" (Numbering) to add sequential numbers to file names. You'll be prompted to enter a starting number. Numbers will be padded with leading zeros (e.g., `001`, `010`).
* **Aggiungi numerazione**: (Likely similar to the above, might be a duplicate or slightly different numbering option).
* **Tronca**:
    * Enter a **start index** in `inizioField`.
    * Enter an **end index** in `fineField`. Use `L` for the end of the string.
    * Click "**Tronca**" (Truncate) to trim file names based on these indices.
