import { footerComponent, navbar, sidebar } from "./components.js"

const header = document.querySelector("header")
const menu = document.querySelector(".sidebar")
const footer = document.querySelector("footer")

menu.innerHTML = sidebar()
footer.innerHTML = footerComponent(footer)