function Program(props: any) {
  return (
    <>
      <li className="program">
        <h3>{props.title}</h3>
        <p>{props.description}</p>
      </li>
    </>
  );
}
export default Program;
