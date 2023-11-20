import { footerComponent, navbar, sidebar } from "./components.js";
import { courses } from "./data.js";

const header = document.querySelector("header")
const menu = document.querySelector(".sidebar")
const footer = document.querySelector("footer")
const teachers = document.querySelector(".box-container")

menu.innerHTML = sidebar()
footer.innerHTML = footerComponent(footer)
