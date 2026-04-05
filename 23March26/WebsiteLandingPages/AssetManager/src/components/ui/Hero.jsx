function Hero() {
  return (
    <section className="py-30 border rounded-4xl bg-olive-950 text-white ">
      <div className="flex justify-around">
        <div className="px-10">💠Cortex</div>
        <div className="border rounded-4xl bg-gray-900 p-2">Unlock your Asset Spark</div>
        <div className="px-10">Quard💠</div>
      </div>
      <div className="flex flex-col items-center justify-center text-center min-h-[50vh]">
        <div className=" p-5 text-7xl font-semibold tracking-tight">
          <strong>
            <span className="text-white">One-click </span>
            <span className="text-gray-600">for Asset Defense</span>
          </strong>
        </div>
        <div className="text-white">
          Dive into the art assets, where innovative blockchain technology meets
          financial expertise
        </div>
      </div>
      <div className="flex justify-center gap-5 p-5 ">
        <div className="bg-black text-white px-4 py-2 rounded-xl cursor-pointer transition-colors duration-300 hover:bg-white hover:text-black border border-white">
          Open App
        </div>
        <div className="bg-black text-white px-4 py-2 rounded-xl cursor-pointer transition-colors duration-300 hover:bg-white hover:text-black border border-white">
          Discover More
        </div>
      </div>
    </section>
  );
}
export default Hero;
