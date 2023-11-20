import { cardCurso, footerComponent, navbar, sidebar } from './components.js'
import { courses } from './data.js'

const header = document.querySelector("header")
const menu = document.querySelector(".sidebar")
const footer = document.querySelector("footer")
const cursosSection = document.querySelector("#courses .box-container")

menu.innerHTML = sidebar()
footer.innerHTML = footerComponent(footer)

//courses.map((course) => {
//    cursosSection.innerHTML += cardCurso(course)
//})