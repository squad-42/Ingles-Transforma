import { footerComponent, navbar, sidebar } from "./components.js"
import { courses } from "./data.js"

const header = document.querySelector("header")
const menu = document.querySelector(".sidebar")
const footer = document.querySelector("footer")
const playlistDetails = document.querySelector(".row")
const videosSection = document.querySelector(".box-container")

const codCurso = localStorage.getItem("codCurso")
const { prof, profPic, thumb, date, course, numOfVid } = courses.find((course) => course.cod === codCurso)


menu.innerHTML = sidebar()
footer.innerHTML = footerComponent(footer)

playlistDetails.innerHTML = `
       <div class="col">
          <form action="" method="post" class="save-list">
            <button type="submit"><i class="far fa-bookmark"></i><span>salvar playlist</span></button>
          </form>
          <div class="thumb">
            <span>${numOfVid} vídeos</span>
            <img src="../../assets/imgs/thumb-${thumb}.png" alt="">
          </div>
        </div>

        <div class="col">
          <div class="tutor">
            <img src="../../assets/imgs/pic-${profPic}.jpg" alt="">
            <div>
              <h3>${prof}</h3>
              <span>Professor</span>
            </div>
          </div>

          <div class="details">
            <h3>${course}</h3>
            <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Deleniti nostrum ipsum ut possimus veritatis
              fuga!</p>
            <div class="date">
              <i class="fas fa-calendar">
                <span>${date}</span>
              </i>
            </div>
          </div>
        </div>
  `

for (let i = 1; i <= numOfVid; i++) {
  videosSection.innerHTML += `
       <a href="/videoaula" onclick="setClass(${i})" class="box">
          <i class="fas fa-play"></i>
          <img src="../../assets/imgs/thumb-${thumb}.png" alt="">
          <span>Aula ${i}</span>
          <h3>${course}</h3>
        </a>
  `
}

