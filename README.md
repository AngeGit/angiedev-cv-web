# 🌐 AngieDev CV Web

[![GitHub Pages](https://img.shields.io/badge/Live%20Site-Coming%20Soon-blueviolet?style=flat-square&logo=github)](https://yourusername.github.io/angiedev-cv-web)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.22-orange?style=flat-square&logo=kotlin)](https://kotlinlang.org)
[![Compose](https://img.shields.io/badge/Compose%20Web-1.6.10-blue?style=flat-square&logo=jetbrains)](https://github.com/JetBrains/compose-multiplatform)

Interactive CV and portfolio built with **Kotlin Multiplatform** and **JetBrains Compose Web**.

This site showcases my experience as an Android, KMM and Compose Multiplatform developer. It features a downloadable resume, responsive layout, and modular components styled with Compose's native CSS DSL.

---

## 🔧 Tech Stack

- ✅ Kotlin Multiplatform (JS target)
- ✅ JetBrains Compose for Web
- ✅ Gradle (Kotlin DSL)
- ✅ GitHub Pages for deployment

---

## 📋 Features

- Modular composables with reusable structure
- Responsive layout and custom styles
- Downloadable PDF resume
- Live hosting via GitHub Pages


---

## 📄 Run Locally

```bash
./gradlew :composeApp:wasmJsBrowserDevelopmentRun
```

Then open [http://localhost:8080](http://localhost:8080) in your browser.

---

## 🛫 Manual Deploy to GitHub Pages

1. Build the web distribution:
   ```bash
   ./gradlew :composeApp:wasmJsBrowserDistribution
   ```
2. Go to the generated folder:
   ```bash
   cd composeApp/build/dist/wasmJs/productionExecutable
   ```
3. (Optional) Initialize a temporary repo for GitHub Pages:
   ```bash
   git init
   git remote add origin https://github.com/YOUR_USERNAME/angiedev-cv-web.git
   git checkout -b gh-pages
   git add .
   git commit -m "Deploy"
   git push origin gh-pages --force
   ```
4. Go to GitHub → Settings → Pages:
   - Source: gh-pages
   - Folder: / (root)

---

## 🔍 Screenshots

Coming soon

---

## 🚀 Roadmap

- Add more interactive components
- Improve mobile responsiveness
- Integrate PDF export for resume
- Add dark mode support
- More features coming soon!

---

## 💖 License

This project is open for inspiration but not licensed for redistribution. Contact me if you want to fork or reuse parts.

Made with ❤️ in Compose by [@AngeGit](https://github.com/AngeGit)
