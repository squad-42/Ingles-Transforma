import { footerComponent, navbar, sidebar } from "./components.js";
import { courses } from "./data.js";

const header = document.querySelector("header")
const menu = document.querySelector(".sidebar")
const footer = document.querySelector("footer")
const profile = document.querySelector(".details")
const coursesSection = document.querySelector(".box-container")

const codCurso = localStorage.getItem("codCurso")

menu.innerHTML = sidebar()
footer.innerHTML = footerComponent(footer)

const { cod, prof, profPic, course, thumb, numOfVid } = courses.find((couse) => couse.cod === codCurso)


