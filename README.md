# Figuring Out the Play Asset Pipeline

 1. CSS and image fingerprinting is working
 1. JQuery via webjars is working
 1. I want to combine and minify all .js files into `main.js` for prod mode, with the exception of WebJars JS. 
    Currently all JS, including WebJars jS is combined and minified, but not loaded.
    Combining the WebJars JS makes the combinding take a really long time and they end up in 
    `target/web/uglify/build/main.min.js`, which is unfortunately not the main.min.js file that gets loaded.
 1. In dev mode it would be fine to load all `.js` files separately or together (I don't care), but I don't want them to be minified.
