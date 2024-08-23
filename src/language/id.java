package language;

public class id implements Language {
    public id() {}
    public String[] getStrings() { return strings; }

    static final String[] strings = {
        // Translation notes:
        // - Any line that begins with a "//" is a comment and is ignored.
        //   In this file, comments are used for explaining each string.
        // - Write your translated string inside the two quotation marks.
        // - If you need to use a quotation mark inside any of your translated
        //   strings, write it as \" instead.
        // - If the original string has any special formatting
        //   (e.g. space at the beginning or end), keep the formatting the same.
        // - If you want the English text to be shown for a specific string,
        //   replace the string with null (without any quotation marks).
        // - For any Discord-specific terminology (e.g. servers), use the same
        //   translated term that Discord officially uses for your language.

        // Notes about softkey command labels:
        // - Each softkey label has two variations, a short and a long one.
        // - In this translation file, the short labels are listed above the long ones.
        // - Short labels are used in places where there is limited screen space.
        // - Keep short labels as short as possible, ideally below 10 characters.
        //   If needed, you may use abbreviations.
        // - If a long label is short enough to where it could be used as a
        //   short label, use the same string for both labels.

        // Placeholder file name shown when the name of an attachment in the attachment view screen could not be loaded.
        "Berkas tanpa nama",

        // Title text for the attachment picker (native file picker) screen.
        "Pilih Lampiran",

        // Softkey labels for going back to the previous screen.
        "Kmbli",
        "Kembali",

        // Softkey label for closing a menu.
        // Currently used in the attachment picker for closing the whole picker (because there is also a "Back" softkey for going back one directory)
        "Tutup",
        "Tutup",

        // Title text for attachment view screen.
        "Lampiran",

        // Softkey labels for refetching contents of channel view or attachment view.
        "Segarkn",
        "Segarkan",

        // Softkey labels used in channel or DM list for marking the selected channel or DM as read.
        "Tnd. Dibaca",
        "Tandai dibaca",

        // Softkey labels used in channel and DM lists for marking every DM or every channel in the currently shown server as read.
        "TndSemuaTlhBaca",
        "Tandai semua tlh dibaca",

        // Generic "Select" softkey labels.
        "Pilih",
        "Pilih",

        // Softkey labels for sending a message in the currently open channel.
        "Kirim",
        "Kirim",

        // Softkey labels for sending a reply to the selected message.
        "Balas",
        "Balas",

        // Softkey labels for sending an attachment in the currently open channel.
        "Unggah",
        "Unggah berkas",

        // Softkey labels for copying the text content of the selected message.
        "Salin",
        "Salin isi",

        // Softkey labels for editing the selected message.
        "Edit",
        "Edit",

        // Softkey labels for deleting the selected message.
        "Hapus",
        "Hapus",

        // Softkey labels for selecting an URL in the selected message. This opens a screen where each URL found in the message is listed, and one can be selected to be opened in the device's browser.
        "Buka URL",
        "Buka URL",

        // Channel view title suffix when reading older messages.
        " (lama)",

        // Text shown at the center of the channel view when it is empty (no messages).
        "Tidak ada pesan",

        // Channel view banner text shown when reading older messages and a new message arrives via the gateway.
        "Segarkan utk membaca pesan t'baru",

        // Channel view banner text shown when a gateway disconnect occurred and an automatic reconnect is in progress.
        "Menyambungkan",

        // Channel view banner shown when a message is being sent by the client.
        "Mengirim pesan",

        // Channel view banner shown when a message is being edited by the client.
        "Mengubah pesan",

        // Channel view banner shown when a message is being deleted by the client.
        "Menghapus pesan",

        // Channel view banner shown when messages are being loaded, e.g. during a refresh or after a message was sent by the client.
        "Memuat pesan",

        // Suffix for channel view banner text when one person is typing.
        // Example: "aa is typing"
        " sedang mengetik",

        // Suffix for channel view banner text when two or three people are typing.
        // Example: "aa, bb, cc are typing"
        " sedang mengetik",

        // Suffix for channel view banner text when more than three people are typing.
        // Example: "4 people are typing"
        " orang sedang mengetik",

        // Comma separator used to separate usernames in the channel view banner text shown when people are typing.
        ", ",

        // Error messages shown when trying to upload a file, delete a message, or edit a message, and the current proxy server is a direct HTTPS-HTTP proxy (and not a Discord J2ME specific proxy)
        "Mengunggah file tdk didukung oleh proxy yg anda gunakn",
        "Menghapus pesan tdk didukung oleh proxy yg anda gunakn",
        "Mengedit psn tdk didukung oleh proxy yg anda gunakn",

        // Error message shown when trying to open the native file picker and the device does not support the J2ME FileConnection API.
        "FileConnection tidak didukung",

        // Button labels for navigating between pages of messages in the channel view. Try to keep these as long as (or shorter than) the English strings.
        // In the old channel view, these are shown as softkey labels (these strings are short and long variations of each)
        "Lama",
        "Liht pesan t'lama",
        "Baru",
        "Liht pesan t'baru",

        // Parts of the button label for viewing attachments of a message.
        // Examples: "View 1 attachment", "View 2 attachments"
        "Lihat ",
        " lampiran",
        " lampiran",

        // Title for confirmation screen shown when deleting a message.
        "Hapus",

        // Body text for confirmation screen shown when deleting a message.
        "Hapus pesan?",

        // Generic softkey labels.
        "Ya",
        "Ya",
        "Tdk",
        "Tidak",
        "Ok",
        "Ok",

        // Placeholder name shown when fetching the name of an item (e.g. message author or DM) failed.
        "(tidak diketahui)",

        // Placeholder shown when the recipient message of a reply does not have any text content.
        "(tidak ada konten)",

        // Placeholder message content shown when a message does not have any content that is supported by Discord J2ME.
        "(pesan tidak didukung)",

        // Message content shown for a message that has been deleted.
        "(telah dihapus)",

        // Title text for direct message search screen.
        "Cari DM",

        // Guide text for text field in direct message search and "insert mention" screens.
        "Masukkan nama pengguna",

        // Error message shown when the searched user was not found in the direct messages list. Discord J2ME cannot initiate DM conversations based on only a username, so this message asks the user to use another client.
        "P'guna tdk ditemukan. Coba buat DM dengan klien lain.",

        // Title text for direct message list.
        "Pesan-pesan Saya",

        // Generic "Search" softkey label. Currently used for searching for usernames in direct messages and when inserting a mention/ping.
        "Cari",
        "Cari",

        // Title text shown for all error message screens.
        "Kesalahan",

        // Title text shown for guild (server) selector.
        "Server",

        // Title text shown for favorite servers list.
        "Favorit",

        // Generic "Remove" softkey command. Currently used for removing a server from the favorites list.
        "Hapus",
        "Hapus",

        // Softkey command for adding a server to the favorites list.
        "Favorit",
        "Tambahkn ke favorit",

        // Text shown when the gateway disconnects due to an error with the heartbeat thread. As this error message is quite technical, you may simplify/generalize it to, for example, "connection error".
        "Heartbeat thread error: ",

        // Error message shown when the supplied authentication token is invalid (HTTP Unauthorized).
        "Periksa token anda",

        // Prefix of error message shown when the HTTP response has an error code.
        // The full message consists of this string and the code itself,
        // e.g. HTTP error 500
        "Kesalahan HTTP ",

        // Error message shown when trying to load attachments and the CDN URL hasn't been set (is empty).
        "URL CDN belum diatur. Lampiran tdk tersedia.",

        // Parentheses. Don't change these unless your language uses a different writing system where a different type of parentheses is normally used.
        " (",
        ")",

        // Softkey labels for showing a text attachment's contents within the app.
        "Tampilkn",
        "Tamp. sbg teks",

        // Softkey labels for showing an attachment in the device's built-in web browser.
        "Buka",
        "Buka di peramban",

        // Generic "Loading..." text shown in loading screen and in "Insert mention" screen.
        "Memuat...",

        // Loading screen text shown when an attachment is being sent.
        "Mengirim...",

        // Error message prefix shown when an error occurs while uploading an attachment.
        "Kesalahan saat mengirim: ",

        // Generic "Skip" softkey label. Currently used for skipping an action in the key mapper.
        "Skip",
        "Skip",

        // Key press prompt shown in hotkey mapper.
        "Tekan tombol yg akan digunakan utk:",

        // Names of hotkey actions shown in the key mapper.
        // These are shown after the "Press the key to use for:" string.
        // "going back" only applies to the chat view, 
        "Mengirim pesan",
        "Membalas pesan",
        "Menyalin isi pesan",
        "Menyegarkan",
        "Kembali",

        // Error message prefix shown when a key has been mapped to an action and the user tried to map the same key to another action. The name of the already mapped action (see above) is written after this prefix.
        "Tmbl ini telah digunakan utk ",

        // Title text shown in login screen.
        "Masuk",

        // Proxy server warning message shown at the top of the login screen.
        "Hanya gunakan proxy yang terpercaya!",

        // Help message for finding your token. Shown in login screen above the token field.
        "Token dapat ditemukan menggunakan dev tools di peramban PC yang anda gunakan untuk login di Discord. Direkomendasikan untuk menggunakan akun alt.",

        // "Use Wi-Fi" option shown in login screen on BlackBerry devices.
        "Gunakan Wi-Fi",

        // Labels of text fields shown in the login screen.
        // You don't need to use these acronyms if they don't make sense in your language. Translations like "Server URL" and "Image server URL" are acceptable too.
        "API URL",
        "CDN URL",
        "Gateway URL",
        "Token",

        // Softkey label for confirming the login options in the login screen.
        "Masuk",
        "Masuk",

        // Softkey command for exiting the application.
        "Keluar",
        "Keluar",

        // "Use gateway" option shown in login screen.
        "Gunakan gateway",

        // Label for radio button field for token sending options.
        "Kirim token sbg",

        // Token sending options.
        "Header (default)",
        "JSON",
        "Query parameter",

        // Error messages shown when trying to login and the token or API URL fields are empty.
        "Tolong masukkan Token anda",
        "Silahkan atur API URL",

        // Main menu items.
        // "Keluar" brings you back to the login screen where you enter your token and other login settings.
        "Server saya",
        "Favorit",
        "Pesan-pesan",
        "Pengaturan",
        "Log keluar",

        // Title text shown in "Insert mention" screen (for adding a ping when writing a message).
        "Masukkan mention",

        // Label shown for username search results in "Insert mention" screen. Shown if more than one user matches the username query.
        "Hasil Pencarian",

        // Message shown when the username query resulted in no matches in the "Insert mention" screen.
        "Tidak ada",

        // Error message shown when selecting "Insert" in the "Insert mention" screen and none of the search results (radio buttons) were picked.
        "Tidak ada yang dipilih",

        // Prefix and suffix of status message shown when a user has been added to a group DM. The whole message is in the form "added X to the group"
        " telah ditambahkan",
        " ke dalam grup",

        // Status message shown when a user has left a group DM.
        "keluar dari grup",

        // Prefix and suffix of status message shown when a user has removed another user from a group DM. The whole message is in the form "removed X from the group".
        " telah dihapus",
        " from the group",

        // Status messages.
        "memulai panggilan",
        "mengubah nama grup",
        "mengubah ikon grup ",
        "menyematkan pesan",
        "bergabung ke server",
        "mem-boost server",

        // Prefix of status message shown when a user has boosted the server and the server has reached a certain boosting level. The level is appended to the end of this string, in the form "boosted the server to level X".
        "mem-boost server ke level ",

        // Prefix of message content when the message is a sticker.
        // The whole message is in the form of "(sticker: Name)"
        "(stiker: ",

        // Placeholder name for a sticker when the sticker's name could not be fetched.
        "tidak dikenal",

        // Message timestamp hour-minute separator, day-month separator, and AM/PM indicators.
        // Note: order of day and month cannot be changed currently
        ".",
        "-",
        "Pagi",
        "Petang",

        // Softkey labels for inserting a mention/ping in the "send message" screen.
        "Mention",
        "Masukkan mention",

        // Prefixes of title text for "send message" screen.
        // The full title is in the form of "Send message (@user)" or "Send message (#channel)".
        "Mengirim Pesan (@",
        "Mengirim Pesan (#",

        // Error message shown when trying to insert a mention into a message and the gateway connection is not active.
        "Koneksi gateway yg aktif diperlukan",

        // Title text for "copy message content" screen.
        "Salin pesan",

        // Title text for "edit message content" screen.
        "Edit pesan",

        // Title text for gateway disconnect prompt screen.
        "Terputus",

        // Main body text for gateway disconnect prompt screen.
        "Gagal menyambungkan ke gateway, coba lagi?",

        // Top label for disconnection message shown in gateway disconnect prompt screen. The disconnection message is either a message sent by the Discord gateway (such as "requesting client reconnect") or a Java exception.
        "Pesan",

        // Prefix for top body text shown in the reply form. The whole top text is in the form "Replying to @user". The contents of the recipient message are shown below this.
        "Membalas ",

        // Top label for the message entry box in the reply form.
        "Pesan:",

        // Checkbox for selecting whether to mention/ping the recipient. Shown in the reply form.
        "Mention penulis",

        // Title text for settings menu.
        "Pengaturan",

        // Settings screen heading for themes section.
        "Tema",

        // Theme options.
        "Gelap",
        "Terang",
        "Hitam pekat",

        // Settings screen heading for miscellaneous user interface related settings.
        "Antarmuka",

        // Settings option for enabling the old channel view user interface (from version 1.1 and below).
        "Gunakn UI lama",

        // Settings option for using 12-hour time format in timestamps.
        "Waktu 12-jam",

        // Settings option for using the Java-based file picker for sending attachments. If disabled, the web-based file picker is used.
        "Pemilih berkas bawaan",

        // Settings option for automatically reconnecting to the gateway if the connection closes.
        "Gateway reconnect otomatis",

        // Settings option for enabling icons in server and direct message lists.
        "Ikon Server/DM",

        // Settings option for enabling nickname role colors.
        "Warna nama",

        // Settings screen heading for message author font size.
        "Font nama pengirim",

        // Font size options.
        "Kecil",
        "Sedang",
        "Besar",

        // Settings screen heading for message content font size.
        "Font isi pesan",

        // Settings screen heading for message load count. This is the amount of messages that are loaded and shown at a time.
        "Hitungan pesan yg akan dimuat",

        // Settings screen heading for selecting attachment file format.
        "Jenis Lampiran",

        // Settings screen heading for maximum attachment size in pixels.
        "Ukuran maks. lampiran",

        // Settings screen heading for profile picture shape.
        // Note: The word "avatar" was used here because "profile picture shape" is too long to fit on one row on some phones, and I didn't want to shorten it as "PFP".
        "Bentuk Avatar",

        // Settings options for profile picture shape. "Circle (HQ)" is circle but with anti-aliasing and smoothing enabled.
        "Persegi",
        "Bundar",
        "Bundar (HQ)",

        // Settings section for profile picture resolution.
        "Resolusi",

        // Settings options for profile picture resolution. Placeholder means the PFPs won't get downloaded, but instead a placeholder (username's initials) is shown.
        "Hny Placeholder",

        // Resolution options. Used for profile picture resolution and menu icon resolution.
        "Mati",
        "16 px",
        "32 px",

        // Settings section for menu icon size.
        "Ukuran ikon menu",

        // Settings section for controlling the display of reply messages.
        "Tampilkan balasan dengan",

        // Settings option to show replies as only the recipient (in the form "Author -> Recipient").
        "Penerima saja",

        // Settings option to show replies with the whole recipient message.
        "Seluruh isi pesan",

        // Settings section for hotkey action management.
        "Hotkey",

        // Settings option to use "default" hotkeys. When enabled, the J2ME game actions (ABCD) are used for hotkey actions, instead of user-defined key bindings. I named it "default" due to the lack of a better term for people who aren't familiar with J2ME development.
        "Hotkey default",

        // Softkey label for opening the key remapper in the settings menu. The long variant of the label is shown as the button text.
        "TetapknTbl",
        "Tetapkan tombol",

        // Generic softkey labels. Currently used in settings menu.
        "Simp.",
        "Simpan",
        "Batal",
        "Batalkan",

        // Error message shown when trying to open an URL (e.g. attachment)from the app, but the phone does not support opening URLs while keeping the app running in the background.
        "Apl ini harus ditutup sebelum tautan dapat dibuka",

        // Prefix of error message shown when an error occurs when trying to open an URL.
        "Tautan tidak dapat dibuka (",

        // Suffix of error message shown when an error occurs when trying to open an URL. The actual URL is shown after this message.
        ")\n\nAnda mungkin harus menyalin tautan ke peramban web gawai anda: ",

        // Title text for URL list screen ('Open URL' option in channel view).
        "Pilih URL",

        // Softkey labels for inserting a mention in the "Insert mention" screen.
        "Masukn",
        "Masukkan",
    };
}