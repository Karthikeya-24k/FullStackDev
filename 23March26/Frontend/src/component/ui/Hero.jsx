

function Hero() {
    const clickfunction = () =>{
        window.location.href = "https://gemini.google.com/app/0435adfb4628c980";
    };
    
  return (
    <>
      <section className="flex w-full justify-center items-center h-75 bg-emerald-300">
        <div className="text-center flex flex-col items-center">
          <div className="text-6xl pb-5">Prosparity of Knowledge</div>
          <div className="text-3xl pb-5">Sri JCBM College, Sringeri</div>
          <div>
            <button className="text-2xl border-2  w-50 bg-emerald-400 cursor-pointer hover:bg-cyan-800" onClick={clickfunction}>
              Explore
            </button>
          </div>
        </div>
      </section>
    </>
  );
}
export default Hero;
