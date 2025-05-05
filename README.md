# 📺 VideoLoopTV for Android TV

**VideoLoopTV** is a simple Android TV app that automatically plays all videos from the `raw` folder in a continuous loop when opened.  
Perfect for unattended business displays like self-service laundromats, workshops, or kiosks. No credits required — feel free to edit and reuse it!

---

## ✅ Features

- Plays all videos stored in the app’s `res/raw` folder
- Autoplays and loops videos endlessly
- Designed for 24/7 unattended operation
- Can be started automatically on boot with a helper app
- Compatible with remote power control via Google Home or similar

---

## 🛠️ How to Set It Up

### 1. **Install Downloader (Optional, but Recommended)**

To easily download APKs directly on your Android TV:

- Open **Google Play Store** on your Android TV
- Search and install: **Downloader by AFTVnews**

### 2. **Install VideoLoopTV**

#### Option A: Download and install manually
1. Download the latest APK from the GitHub repository or your preferred source  
   _https://github.com/jsarriaa/VideoLoopTV/releases/download/1/VideoLoopTV.apk_
2. Use **Downloader** or a USB drive to transfer and install it on your Android TV

#### Option B: Build from source
If you're a developer:
- Clone or download the source code
- Add your `.mp4` videos to the `res/raw` folder
- Build and install via **Android Studio**

### 3. **Install LaunchOnBoot**

- Go to: [https://f-droid.org/packages/news.androidtv.launchonboot/](https://f-droid.org/packages/news.androidtv.launchonboot/)
- Download and install **LaunchOnBoot**

### 4. **Configure LaunchOnBoot**

- Open **LaunchOnBoot**
- Select **VideoLoopTV** as the app to launch on boot
- Done! Now VideoLoopTV will start automatically every time the TV powers on

### 5. **(Optional) Use Google Home for Power Control**

To turn the TV on/off with voice:

- Make sure your Android TV is connected to the same Google account used with Google Home
- Add your Android TV to your Google Home app
- You can now say:
  - “Hey Google, turn on the TV”
  - “Hey Google, turn off the TV”

---

## 📂 How to Add Your Own Videos

1. Place your `.mp4` videos inside the `app/src/main/res/raw/` folder
2. Make sure filenames are all lowercase and contain no special characters
3. Rebuild the app via Android Studio
4. Install the updated APK on your TV

> ✅ **Note**: Due to Android resource rules, filenames in `res/raw/` must use only lowercase letters, numbers, and underscores (e.g., `video1.mp4`, `laundry_tutorial.mp4`).

---

## 💡 Example Use Case

- 👕 **Self-Service Laundry**
- 🧰 **Workshop Demo Station**
- 🖥️ **Product Display on Storefront TVs**
- 📚 **Tutorial Loop for Unattended Training**

---

## 🚀 Want to Extend It?

Fork it. Change it. Automate it. No need to credit.

You're welcome to:
- Add remote control features
- Load videos from external storage or a network drive
- Use with motion sensors, custom launchers, or scheduling apps

![Logo](app/src/main/res/raw/logotioperro.PNG)
