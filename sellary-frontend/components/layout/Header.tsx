const Header=()=>{
    return(
        <header className="flex items-center justify-between sticky top-0 z-10 text-white p-3">
            {/* 왼쪽 영역 */}
            <div className="">
                {/* 로고 */}
                {/* <Image src="" alt="logo"/> */}
                SELLARY
            </div>
            {/* 가운데 영역 */}
            <div className="justify-center"></div>
            {/* 오른쪽 영역 */}
            <div className="justify-end "></div>
        </header>
    )
}
export default Header;