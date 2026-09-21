// ============================ 
// Año dinámico en el footer 
//  ============================ 

let elementoAnio = document.getElementById("year");
let fecha = new Date();
let anio = fecha.getFullYear();
elementoAnio.textContent = anio;

// ============================

// Animaciones al hacer scroll

// ============================

const elementosAbout = document.querySelectorAll(".about-animate");

const observer = new IntersectionObserver(
    (entries) => {

        entries.forEach((entry) => {


                if (entry.intersectionRatio >= 0.3) {
                entry.target.classList.add("visible");
            } else if (entry.intersectionRatio === 0) {
                entry.target.classList.remove("visible");
            }
            
        });
    },
    {
        threshold: [0, 0.3],
        rootMargin: "0px 0px -50px 0px",
    }
);

elementosAbout.forEach((elemento) => {
    observer.observe(elemento);
});